/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.tables;


import eki.wordweb.data.db.Indexes;
import eki.wordweb.data.db.Public;
import eki.wordweb.data.db.tables.records.MviewWwFormRecord;

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
public class MviewWwForm extends TableImpl<MviewWwFormRecord> {

    private static final long serialVersionUID = 1612037951;

    /**
     * The reference instance of <code>public.mview_ww_form</code>
     */
    public static final MviewWwForm MVIEW_WW_FORM = new MviewWwForm();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MviewWwFormRecord> getRecordType() {
        return MviewWwFormRecord.class;
    }

    /**
     * The column <code>public.mview_ww_form.word_id</code>.
     */
    public final TableField<MviewWwFormRecord, Long> WORD_ID = createField("word_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.mview_ww_form.word</code>.
     */
    public final TableField<MviewWwFormRecord, String> WORD = createField("word", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.mview_ww_form.lang</code>.
     */
    public final TableField<MviewWwFormRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>public.mview_ww_form.dataset_codes</code>.
     */
    public final TableField<MviewWwFormRecord, String[]> DATASET_CODES = createField("dataset_codes", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>public.mview_ww_form.paradigm_id</code>.
     */
    public final TableField<MviewWwFormRecord, Long> PARADIGM_ID = createField("paradigm_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.mview_ww_form.inflection_type</code>.
     */
    public final TableField<MviewWwFormRecord, String> INFLECTION_TYPE = createField("inflection_type", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.mview_ww_form.form_id</code>.
     */
    public final TableField<MviewWwFormRecord, Long> FORM_ID = createField("form_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.mview_ww_form.mode</code>.
     */
    public final TableField<MviewWwFormRecord, String> MODE = createField("mode", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.mview_ww_form.morph_group1</code>.
     */
    public final TableField<MviewWwFormRecord, String> MORPH_GROUP1 = createField("morph_group1", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.mview_ww_form.morph_group2</code>.
     */
    public final TableField<MviewWwFormRecord, String> MORPH_GROUP2 = createField("morph_group2", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.mview_ww_form.morph_group3</code>.
     */
    public final TableField<MviewWwFormRecord, String> MORPH_GROUP3 = createField("morph_group3", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.mview_ww_form.display_level</code>.
     */
    public final TableField<MviewWwFormRecord, Integer> DISPLAY_LEVEL = createField("display_level", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.mview_ww_form.morph_code</code>.
     */
    public final TableField<MviewWwFormRecord, String> MORPH_CODE = createField("morph_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.mview_ww_form.morph_exists</code>.
     */
    public final TableField<MviewWwFormRecord, Boolean> MORPH_EXISTS = createField("morph_exists", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.mview_ww_form.form</code>.
     */
    public final TableField<MviewWwFormRecord, String> FORM = createField("form", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.mview_ww_form.components</code>.
     */
    public final TableField<MviewWwFormRecord, String[]> COMPONENTS = createField("components", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>public.mview_ww_form.display_form</code>.
     */
    public final TableField<MviewWwFormRecord, String> DISPLAY_FORM = createField("display_form", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.mview_ww_form.vocal_form</code>.
     */
    public final TableField<MviewWwFormRecord, String> VOCAL_FORM = createField("vocal_form", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.mview_ww_form.sound_file</code>.
     */
    public final TableField<MviewWwFormRecord, String> SOUND_FILE = createField("sound_file", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.mview_ww_form.order_by</code>.
     */
    public final TableField<MviewWwFormRecord, Integer> ORDER_BY = createField("order_by", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.mview_ww_form</code> table reference
     */
    public MviewWwForm() {
        this(DSL.name("mview_ww_form"), null);
    }

    /**
     * Create an aliased <code>public.mview_ww_form</code> table reference
     */
    public MviewWwForm(String alias) {
        this(DSL.name(alias), MVIEW_WW_FORM);
    }

    /**
     * Create an aliased <code>public.mview_ww_form</code> table reference
     */
    public MviewWwForm(Name alias) {
        this(alias, MVIEW_WW_FORM);
    }

    private MviewWwForm(Name alias, Table<MviewWwFormRecord> aliased) {
        this(alias, aliased, null);
    }

    private MviewWwForm(Name alias, Table<MviewWwFormRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MviewWwForm(Table<O> child, ForeignKey<O, MviewWwFormRecord> key) {
        super(child, key, MVIEW_WW_FORM);
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
        return Arrays.<Index>asList(Indexes.MVIEW_WW_FORM_DISPLAY_LEVEL_IDX, Indexes.MVIEW_WW_FORM_LANG_IDX, Indexes.MVIEW_WW_FORM_MODE_IDX, Indexes.MVIEW_WW_FORM_VALUE_IDX, Indexes.MVIEW_WW_FORM_WORD_ID_IDX, Indexes.MVIEW_WW_FORM_WORD_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwForm as(String alias) {
        return new MviewWwForm(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwForm as(Name alias) {
        return new MviewWwForm(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwForm rename(String name) {
        return new MviewWwForm(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwForm rename(Name name) {
        return new MviewWwForm(name, null);
    }
}
