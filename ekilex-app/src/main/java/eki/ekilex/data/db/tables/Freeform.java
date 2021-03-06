/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.FreeformRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Freeform extends TableImpl<FreeformRecord> {

    private static final long serialVersionUID = 51489509;

    /**
     * The reference instance of <code>public.freeform</code>
     */
    public static final Freeform FREEFORM = new Freeform();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FreeformRecord> getRecordType() {
        return FreeformRecord.class;
    }

    /**
     * The column <code>public.freeform.id</code>.
     */
    public final TableField<FreeformRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('freeform_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.freeform.parent_id</code>.
     */
    public final TableField<FreeformRecord, Long> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.freeform.type</code>.
     */
    public final TableField<FreeformRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.freeform.value_text</code>.
     */
    public final TableField<FreeformRecord, String> VALUE_TEXT = createField("value_text", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.freeform.value_prese</code>.
     */
    public final TableField<FreeformRecord, String> VALUE_PRESE = createField("value_prese", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.freeform.value_date</code>.
     */
    public final TableField<FreeformRecord, Timestamp> VALUE_DATE = createField("value_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.freeform.value_number</code>.
     */
    public final TableField<FreeformRecord, BigDecimal> VALUE_NUMBER = createField("value_number", org.jooq.impl.SQLDataType.NUMERIC(14, 4), this, "");

    /**
     * The column <code>public.freeform.value_array</code>.
     */
    public final TableField<FreeformRecord, String[]> VALUE_ARRAY = createField("value_array", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>public.freeform.classif_name</code>.
     */
    public final TableField<FreeformRecord, String> CLASSIF_NAME = createField("classif_name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.freeform.classif_code</code>.
     */
    public final TableField<FreeformRecord, String> CLASSIF_CODE = createField("classif_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.freeform.lang</code>.
     */
    public final TableField<FreeformRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>public.freeform.process_state_code</code>.
     */
    public final TableField<FreeformRecord, String> PROCESS_STATE_CODE = createField("process_state_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.freeform.order_by</code>.
     */
    public final TableField<FreeformRecord, Long> ORDER_BY = createField("order_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('freeform_order_by_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>public.freeform</code> table reference
     */
    public Freeform() {
        this(DSL.name("freeform"), null);
    }

    /**
     * Create an aliased <code>public.freeform</code> table reference
     */
    public Freeform(String alias) {
        this(DSL.name(alias), FREEFORM);
    }

    /**
     * Create an aliased <code>public.freeform</code> table reference
     */
    public Freeform(Name alias) {
        this(alias, FREEFORM);
    }

    private Freeform(Name alias, Table<FreeformRecord> aliased) {
        this(alias, aliased, null);
    }

    private Freeform(Name alias, Table<FreeformRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Freeform(Table<O> child, ForeignKey<O, FreeformRecord> key) {
        super(child, key, FREEFORM);
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FREEFORM_PARENT_ID_IDX, Indexes.FREEFORM_PKEY, Indexes.FREEFORM_TYPE_IDX, Indexes.FREEFORM_VALUE_TEXT_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FreeformRecord, Long> getIdentity() {
        return Keys.IDENTITY_FREEFORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FreeformRecord> getPrimaryKey() {
        return Keys.FREEFORM_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FreeformRecord>> getKeys() {
        return Arrays.<UniqueKey<FreeformRecord>>asList(Keys.FREEFORM_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FreeformRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FreeformRecord, ?>>asList(Keys.FREEFORM__FREEFORM_PARENT_ID_FKEY, Keys.FREEFORM__FREEFORM_LANG_FKEY, Keys.FREEFORM__FREEFORM_PROCESS_STATE_CODE_FKEY);
    }

    public eki.ekilex.data.db.tables.Freeform freeform() {
        return new eki.ekilex.data.db.tables.Freeform(this, Keys.FREEFORM__FREEFORM_PARENT_ID_FKEY);
    }

    public Language language() {
        return new Language(this, Keys.FREEFORM__FREEFORM_LANG_FKEY);
    }

    public ProcessState processState() {
        return new ProcessState(this, Keys.FREEFORM__FREEFORM_PROCESS_STATE_CODE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Freeform as(String alias) {
        return new Freeform(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Freeform as(Name alias) {
        return new Freeform(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Freeform rename(String name) {
        return new Freeform(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Freeform rename(Name name) {
        return new Freeform(name, null);
    }
}
