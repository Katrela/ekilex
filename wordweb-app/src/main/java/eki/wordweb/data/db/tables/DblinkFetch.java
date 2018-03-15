/*
 * This file is generated by jOOQ.
*/
package eki.wordweb.data.db.tables;


import eki.wordweb.data.db.Public;
import eki.wordweb.data.db.tables.records.DblinkFetchRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DblinkFetch extends TableImpl<DblinkFetchRecord> {

    private static final long serialVersionUID = -2103414746;

    /**
     * The reference instance of <code>public.dblink_fetch</code>
     */
    public static final DblinkFetch DBLINK_FETCH = new DblinkFetch();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DblinkFetchRecord> getRecordType() {
        return DblinkFetchRecord.class;
    }

    /**
     * The column <code>public.dblink_fetch.dblink_fetch</code>.
     */
    public final TableField<DblinkFetchRecord, Record> DBLINK_FETCH_ = createField("dblink_fetch", org.jooq.impl.SQLDataType.RECORD, this, "");

    /**
     * Create a <code>public.dblink_fetch</code> table reference
     */
    public DblinkFetch() {
        this(DSL.name("dblink_fetch"), null);
    }

    /**
     * Create an aliased <code>public.dblink_fetch</code> table reference
     */
    public DblinkFetch(String alias) {
        this(DSL.name(alias), DBLINK_FETCH);
    }

    /**
     * Create an aliased <code>public.dblink_fetch</code> table reference
     */
    public DblinkFetch(Name alias) {
        this(alias, DBLINK_FETCH);
    }

    private DblinkFetch(Name alias, Table<DblinkFetchRecord> aliased) {
        this(alias, aliased, new Field[2]);
    }

    private DblinkFetch(Name alias, Table<DblinkFetchRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DblinkFetch as(String alias) {
        return new DblinkFetch(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DblinkFetch as(Name alias) {
        return new DblinkFetch(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public DblinkFetch rename(String name) {
        return new DblinkFetch(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public DblinkFetch rename(Name name) {
        return new DblinkFetch(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public DblinkFetch call(String __1, Integer __2) {
        return new DblinkFetch(DSL.name(getName()), null, new Field[] { 
              DSL.val(__1, org.jooq.impl.SQLDataType.CLOB)
            , DSL.val(__2, org.jooq.impl.SQLDataType.INTEGER)
        });
    }

    /**
     * Call this table-valued function
     */
    public DblinkFetch call(Field<String> __1, Field<Integer> __2) {
        return new DblinkFetch(DSL.name(getName()), null, new Field[] { 
              __1
            , __2
        });
    }
}
