/*
 * This file is generated by jOOQ.
*/
package eki.wordweb.data.db.tables;


import eki.wordweb.data.db.Indexes;
import eki.wordweb.data.db.Public;
import eki.wordweb.data.db.tables.records.MviewWwClassifierRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
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
public class MviewWwClassifier extends TableImpl<MviewWwClassifierRecord> {

    private static final long serialVersionUID = 683086927;

    /**
     * The reference instance of <code>public.mview_ww_classifier</code>
     */
    public static final MviewWwClassifier MVIEW_WW_CLASSIFIER = new MviewWwClassifier();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MviewWwClassifierRecord> getRecordType() {
        return MviewWwClassifierRecord.class;
    }

    /**
     * The column <code>public.mview_ww_classifier.name</code>.
     */
    public final TableField<MviewWwClassifierRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.mview_ww_classifier.origin</code>.
     */
    public final TableField<MviewWwClassifierRecord, String> ORIGIN = createField("origin", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.mview_ww_classifier.code</code>.
     */
    public final TableField<MviewWwClassifierRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.mview_ww_classifier.value</code>.
     */
    public final TableField<MviewWwClassifierRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.mview_ww_classifier.lang</code>.
     */
    public final TableField<MviewWwClassifierRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * Create a <code>public.mview_ww_classifier</code> table reference
     */
    public MviewWwClassifier() {
        this(DSL.name("mview_ww_classifier"), null);
    }

    /**
     * Create an aliased <code>public.mview_ww_classifier</code> table reference
     */
    public MviewWwClassifier(String alias) {
        this(DSL.name(alias), MVIEW_WW_CLASSIFIER);
    }

    /**
     * Create an aliased <code>public.mview_ww_classifier</code> table reference
     */
    public MviewWwClassifier(Name alias) {
        this(alias, MVIEW_WW_CLASSIFIER);
    }

    private MviewWwClassifier(Name alias, Table<MviewWwClassifierRecord> aliased) {
        this(alias, aliased, null);
    }

    private MviewWwClassifier(Name alias, Table<MviewWwClassifierRecord> aliased, Field<?>[] parameters) {
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MVIEW_WW_CLASSIFIER_NAME_CODE_LANG_IDX, Indexes.MVIEW_WW_CLASSIFIER_NAME_ORIGIN_CODE_LANG_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwClassifier as(String alias) {
        return new MviewWwClassifier(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwClassifier as(Name alias) {
        return new MviewWwClassifier(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwClassifier rename(String name) {
        return new MviewWwClassifier(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwClassifier rename(Name name) {
        return new MviewWwClassifier(name, null);
    }
}
