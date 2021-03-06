/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.WordRecord;

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
public class Word extends TableImpl<WordRecord> {

    private static final long serialVersionUID = 132722414;

    /**
     * The reference instance of <code>public.word</code>
     */
    public static final Word WORD = new Word();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WordRecord> getRecordType() {
        return WordRecord.class;
    }

    /**
     * The column <code>public.word.id</code>.
     */
    public final TableField<WordRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('word_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.word.lang</code>.
     */
    public final TableField<WordRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>public.word.morph_code</code>.
     */
    public final TableField<WordRecord, String> MORPH_CODE = createField("morph_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.word.homonym_nr</code>.
     */
    public final TableField<WordRecord, Integer> HOMONYM_NR = createField("homonym_nr", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.word.word_class</code>.
     */
    public final TableField<WordRecord, String> WORD_CLASS = createField("word_class", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.word.display_morph_code</code>.
     */
    public final TableField<WordRecord, String> DISPLAY_MORPH_CODE = createField("display_morph_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.word.gender_code</code>.
     */
    public final TableField<WordRecord, String> GENDER_CODE = createField("gender_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.word.aspect_code</code>.
     */
    public final TableField<WordRecord, String> ASPECT_CODE = createField("aspect_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.word.etymology_year</code>.
     */
    public final TableField<WordRecord, String> ETYMOLOGY_YEAR = createField("etymology_year", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.word.etymology_type_code</code>.
     */
    public final TableField<WordRecord, String> ETYMOLOGY_TYPE_CODE = createField("etymology_type_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * Create a <code>public.word</code> table reference
     */
    public Word() {
        this(DSL.name("word"), null);
    }

    /**
     * Create an aliased <code>public.word</code> table reference
     */
    public Word(String alias) {
        this(DSL.name(alias), WORD);
    }

    /**
     * Create an aliased <code>public.word</code> table reference
     */
    public Word(Name alias) {
        this(alias, WORD);
    }

    private Word(Name alias, Table<WordRecord> aliased) {
        this(alias, aliased, null);
    }

    private Word(Name alias, Table<WordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Word(Table<O> child, ForeignKey<O, WordRecord> key) {
        super(child, key, WORD);
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
        return Arrays.<Index>asList(Indexes.WORD_ETYM_TYPE_CODE_IDX, Indexes.WORD_HOMONYM_NR_IDX, Indexes.WORD_LANG_IDX, Indexes.WORD_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<WordRecord, Long> getIdentity() {
        return Keys.IDENTITY_WORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WordRecord> getPrimaryKey() {
        return Keys.WORD_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WordRecord>> getKeys() {
        return Arrays.<UniqueKey<WordRecord>>asList(Keys.WORD_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<WordRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<WordRecord, ?>>asList(Keys.WORD__WORD_LANG_FKEY, Keys.WORD__WORD_MORPH_CODE_FKEY, Keys.WORD__WORD_DISPLAY_MORPH_CODE_FKEY, Keys.WORD__WORD_GENDER_CODE_FKEY, Keys.WORD__WORD_ASPECT_CODE_FKEY, Keys.WORD__WORD_ETYMOLOGY_TYPE_CODE_FKEY);
    }

    public Language language() {
        return new Language(this, Keys.WORD__WORD_LANG_FKEY);
    }

    public Morph morph() {
        return new Morph(this, Keys.WORD__WORD_MORPH_CODE_FKEY);
    }

    public DisplayMorph displayMorph() {
        return new DisplayMorph(this, Keys.WORD__WORD_DISPLAY_MORPH_CODE_FKEY);
    }

    public Gender gender() {
        return new Gender(this, Keys.WORD__WORD_GENDER_CODE_FKEY);
    }

    public Aspect aspect() {
        return new Aspect(this, Keys.WORD__WORD_ASPECT_CODE_FKEY);
    }

    public EtymologyType etymologyType() {
        return new EtymologyType(this, Keys.WORD__WORD_ETYMOLOGY_TYPE_CODE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Word as(String alias) {
        return new Word(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Word as(Name alias) {
        return new Word(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Word rename(String name) {
        return new Word(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Word rename(Name name) {
        return new Word(name, null);
    }
}
