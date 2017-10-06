package com.uabc.avanti.store.persistencia;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//Valentin estuvo aqui c:
//ppopppopop
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.metadata.ClassMetadata;

/**
 *
 * @author emmanuelle
 */
public class BaseDAO<T> implements InterfaceDAO<T> {

    private Class<T> tipo;

    public BaseDAO() {
    }

    public BaseDAO(Class<T> tipo) {
        this.tipo = tipo;
        System.out.println("Se crea el bean con la clase: " + tipo.getName());
    }

    @Override
    public void save(T t) {
        System.out.println("Salvando en " + tipo.getSimpleName());

        try {
            HibernateUtil.getSession();
            HibernateUtil.beingTransaccion();
            HibernateUtil.getSession().save(t);
            System.out.println("AGREGADO");
            HibernateUtil.commitTransaction();
        } catch (Exception x) {
            x.printStackTrace();
            HibernateUtil.rollbackTransaction();
        } finally {
            //HibernateUtil.commitTransaction();
            HibernateUtil.closeSession();
        }
    }

    public Serializable saveWR(T t) {
        System.out.println("Salvando en " + tipo.getSimpleName());
        Serializable ser = null;
        try {
            HibernateUtil.getSession();
            HibernateUtil.beingTransaccion();
            ser = HibernateUtil.getSession().save(t);
            System.out.println("AGREGADO");
            HibernateUtil.commitTransaction();
        } catch (Exception x) {
            x.printStackTrace();
            HibernateUtil.rollbackTransaction();
        } finally {
            //HibernateUtil.commitTransaction();
            HibernateUtil.closeSession();
        }

        return ser;
    }

    @Override
    public void saveOrUpdate(T t) {
        System.out.println("Salvando o actualizando en " + tipo.getSimpleName());
        try {
            HibernateUtil.getSession();
            HibernateUtil.beingTransaccion();
            HibernateUtil.getSession().update(t);
            System.out.println("EDITADO");
        } catch (Exception x) {
            x.printStackTrace();
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.commitTransaction();
            HibernateUtil.closeSession();
        }
    }

    @Override
    public void delete(T t) {
        System.out.println("Borrando en " + tipo.getSimpleName());

        try {
            HibernateUtil.getSession();
            HibernateUtil.beingTransaccion();
            HibernateUtil.getSession().delete(t);
            System.out.println("SE ELIMiNO ---");
        } catch (Exception x) {
            System.out.println("Error: " + x.getMessage());
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.commitTransaction();

            HibernateUtil.closeSession();
        }
    }

    @Override
    public List<T> findAll() {
        List<T> result = new ArrayList<>();

        try {
            HibernateUtil.getSession();
            HibernateUtil.beingTransaccion();
            result = HibernateUtil.getSession().createQuery("from " + getTipo().getCanonicalName()).list();
        } catch (Exception x) {
            x.printStackTrace();
            HibernateUtil.rollbackTransaction();
        } finally {

            HibernateUtil.closeSession();

        }
        return result;
    }

    @Override
    public List<T> executeQuery(String query) {
        List<T> result = new ArrayList<>();

        try {
            HibernateUtil.getSession();
            HibernateUtil.beingTransaccion();
            result = HibernateUtil.getSession().createSQLQuery(query).addEntity(getTipo().getCanonicalName()).list();
        } catch (Exception x) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return result;
    }

    public void executeUpdate(String query) {
        try {
            HibernateUtil.getSession();
            HibernateUtil.beingTransaccion();

            HibernateUtil.getSession().createQuery(query).executeUpdate();
        } catch (Exception x) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }

    }

    public List<T> executeQueryNoEntity(String query) {
        List<T> result = new ArrayList<>();

        try {
            HibernateUtil.getSession();
            HibernateUtil.beingTransaccion();
            result = HibernateUtil.getSession().createSQLQuery(query).list();
        } catch (Exception x) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return result;
    }

    public List<T> findByOneParameter(String value, String identificador) {
        List<T> result = new ArrayList<>();
        ClassMetadata catMeta = HibernateUtil.getSessionFactory().getClassMetadata(getTipo());

        String nombre = getTipo().getSimpleName();
        try {
            HibernateUtil.getSession();
            HibernateUtil.beingTransaccion();

            result = HibernateUtil.getSession().createQuery("from " + nombre
                    + " as " + nombre.toLowerCase() + " where " + nombre.toLowerCase() + "." + identificador + " = :id").setString("id", String.valueOf(value)).list();
            System.err.println("Listo");
        } catch (Exception x) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return result;
    }

    public T findByOneParameterUnique(String value, String identificador) {
        Object result = null;
        ClassMetadata catMeta = HibernateUtil.getSessionFactory().getClassMetadata(getTipo());

        String nombre = getTipo().getSimpleName();
        //    System.out.println("El nombre" + nombre);
        try {
            HibernateUtil.getSession();
            HibernateUtil.beingTransaccion();

            result = HibernateUtil.getSession().createQuery("from " + nombre
                    + " as " + nombre.toLowerCase() + " where " + nombre.toLowerCase() + "." + identificador + " = :id").setString("id", String.valueOf(value)).uniqueResult();
            System.err.println("Listo");
        } catch (Exception x) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return (T) result;
    }

    public T executeQueryUnique(String query) {
        Object result = null;

        try {
            HibernateUtil.getSession();
            HibernateUtil.beingTransaccion();
            result = HibernateUtil.getSession().createSQLQuery(query).addEntity(getTipo().getCanonicalName()).uniqueResult();
        } catch (Exception x) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return (T) result;
    }

    public List<T> findByParameters(HashMap<String, String> parameters) {

        List<T> result = new ArrayList<>();
        ClassMetadata catMeta = HibernateUtil.getSessionFactory().getClassMetadata(getTipo());

        String nombre = getTipo().getSimpleName();
        //    System.out.println("El nombre" + nombre);
        try {
            HibernateUtil.getSession();
            HibernateUtil.beingTransaccion();
            StringBuilder builder = new StringBuilder();
            builder.append("from ").append(nombre).append(" as ").append(nombre.toLowerCase()).append(" where ");
            int medida = parameters.size();
            int cont = 1;
            for (Map.Entry<String, String> entry : parameters.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (cont < medida) {
                    builder.append(nombre.toLowerCase()).append(".").append(key).append(" = ").append(value).append(" and ");
                } else {
                    builder.append(nombre.toLowerCase()).append(".").append(key).append(" = ").append(value);

                }
                cont++;
            }

            System.err.println("QUERY: " + builder.toString());

            result = HibernateUtil.getSession().createQuery(builder.toString()).list();
            System.err.println("Listo");
        } catch (Exception x) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return result;

    }

    @Override
    public T find(Integer id) {
        Object obj = null;
        //    System.out.println("El nombre" + id);
        ClassMetadata catMeta = HibernateUtil.getSessionFactory().getClassMetadata(getTipo());
        String identificador = catMeta.getIdentifierPropertyName();

        String nombre = getTipo().getSimpleName();
        try {
            HibernateUtil.getSession();
            HibernateUtil.beingTransaccion();
            obj = HibernateUtil.getSession().createQuery("from " + nombre
                    + " as " + nombre.toLowerCase() + " where " + nombre.toLowerCase() + "." + identificador + " = :id").setString("id", String.valueOf(id)).uniqueResult();
        } catch (Exception x) {
            HibernateUtil.rollbackTransaction();
        } finally {

            HibernateUtil.closeSession();
        }
        return (T) obj;
    }
    //TODO: Crear método para consultar por cuip

    public int getMaxId() {
        Integer maxId = -1;
        ClassMetadata catMeta = HibernateUtil.getSessionFactory().getClassMetadata(getTipo());
        String identificador = catMeta.getIdentifierPropertyName();
        String nombre = getTipo().getSimpleName();
        System.out.println(nombre);
        try {
            HibernateUtil.getSession();
            HibernateUtil.beingTransaccion();
            maxId = (Integer) HibernateUtil.getSession().createQuery("Select MAX(" + identificador + ") as maxId from " + nombre).uniqueResult();
        } catch (Exception x) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }

        return (maxId != null) ? maxId : 0;

    }

    //Coude pagination
    public List<T> list(int firstRow, int rowCount, String sortField, boolean sortAscending) {

        List<T> result = new ArrayList<>();
        HibernateUtil.getSession();
        HibernateUtil.beingTransaccion();
        String nombre = getTipo().getSimpleName();

        if (sortField == null) {
            ClassMetadata catMeta = HibernateUtil.getSessionFactory().getClassMetadata(getTipo());
            sortField = catMeta.getIdentifierPropertyName();
        }

        String sortDirection = sortAscending ? "ASC" : "DESC";
        String sql = String.format("from " + nombre + " ORDER BY %s %s", sortField, sortDirection);

        try {
            result = HibernateUtil.getSession().createQuery(sql).setFirstResult(firstRow).setMaxResults(rowCount).list();
        } catch (Exception x) {
            x.printStackTrace();
            HibernateUtil.rollbackTransaction();
        } finally {

            HibernateUtil.closeSession();
        }
        return result;
    }

    public int count() {
        Integer count = -1;
        HibernateUtil.getSession();
        HibernateUtil.beingTransaccion();
        String nombre = getTipo().getSimpleName();
        try {
            count = Integer.parseInt("" + HibernateUtil.getSession().createQuery("Select count(*) from " + nombre).uniqueResult());
        } catch (Exception x) {
            x.printStackTrace();
            HibernateUtil.rollbackTransaction();
        } finally {

            HibernateUtil.closeSession();
        }
        return (count != null) ? count : 0;
    }

    /**
     * @return the tipo
     */
    public Class<T> getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Class<T> tipo) {
        this.tipo = tipo;
    }

}
