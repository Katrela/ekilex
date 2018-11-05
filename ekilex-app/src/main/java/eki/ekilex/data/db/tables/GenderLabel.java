/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.GenderLabelRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GenderLabel extends TableImpl<GenderLabelRecord> {

    private static final long serialVersionUID = -1692381689;

    /**
     * The reference instance of <code>public.gender_label</code>
     */
    public static final GenderLabel GENDER_LABEL = new GenderLabel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GenderLabelRecord> getRecordType() {
        return GenderLabelRecord.class;
    }

    /**
     * The column <code>public.gender_label.code</code>.
     */
    public final TableField<GenderLabelRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.gender_label.value</code>.
     */
    public final TableField<GenderLabelRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.gender_label.lang</code>.
     */
    public final TableField<GenderLabelRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(3).nullable(false), this, "");

    /**
     * The column <code>public.gender_label.type</code>.
     */
    public final TableField<GenderLabelRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * Create a <code>public.gender_label</code> table reference
     */
    public GenderLabel() {
        this(DSL.name("gender_label"), null);
    }

    /**
     * Create an aliased <code>public.gender_label</code> table reference
     */
    public GenderLabel(String alias) {
        this(DSL.name(alias), GENDER_LABEL);
    }

    /**
     * Create an aliased <code>public.gender_label</code> table reference
     */
    public GenderLabel(Name alias) {
        this(alias, GENDER_LABEL);
    }

    private GenderLabel(Name alias, Table<GenderLabelRecord> aliased) {
        this(alias, aliased, null);
    }

    private GenderLabel(Name alias, Table<GenderLabelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GenderLabel(Table<O> child, ForeignKey<O, GenderLabelRecord> key) {
        super(child, key, GENDER_LABEL);
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
        return Arrays.<Index>asList(Indexes.GENDER_LABEL_CODE_LANG_TYPE_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GenderLabelRecord>> getKeys() {
        return Arrays.<UniqueKey<GenderLabelRecord>>asList(Keys.GENDER_LABEL_CODE_LANG_TYPE_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<GenderLabelRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<GenderLabelRecord, ?>>asList(Keys.GENDER_LABEL__GENDER_LABEL_CODE_FKEY, Keys.GENDER_LABEL__GENDER_LABEL_LANG_FKEY, Keys.GENDER_LABEL__GENDER_LABEL_TYPE_FKEY);
    }

    public Gender gender() {
        return new Gender(this, Keys.GENDER_LABEL__GENDER_LABEL_CODE_FKEY);
    }

    public Language language() {
        return new Language(this, Keys.GENDER_LABEL__GENDER_LABEL_LANG_FKEY);
    }

    public LabelType labelType() {
        return new LabelType(this, Keys.GENDER_LABEL__GENDER_LABEL_TYPE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GenderLabel as(String alias) {
        return new GenderLabel(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GenderLabel as(Name alias) {
        return new GenderLabel(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GenderLabel rename(String name) {
        return new GenderLabel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GenderLabel rename(Name name) {
        return new GenderLabel(name, null);
    }
}
