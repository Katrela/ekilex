/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.LexemeGroupRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
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
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LexemeGroup extends TableImpl<LexemeGroupRecord> {

    private static final long serialVersionUID = -54913141;

    /**
     * The reference instance of <code>public.lexeme_group</code>
     */
    public static final LexemeGroup LEXEME_GROUP = new LexemeGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LexemeGroupRecord> getRecordType() {
        return LexemeGroupRecord.class;
    }

    /**
     * The column <code>public.lexeme_group.id</code>.
     */
    public final TableField<LexemeGroupRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('lexeme_group_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.lexeme_group.lex_rel_type_code</code>.
     */
    public final TableField<LexemeGroupRecord, String> LEX_REL_TYPE_CODE = createField("lex_rel_type_code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * Create a <code>public.lexeme_group</code> table reference
     */
    public LexemeGroup() {
        this(DSL.name("lexeme_group"), null);
    }

    /**
     * Create an aliased <code>public.lexeme_group</code> table reference
     */
    public LexemeGroup(String alias) {
        this(DSL.name(alias), LEXEME_GROUP);
    }

    /**
     * Create an aliased <code>public.lexeme_group</code> table reference
     */
    public LexemeGroup(Name alias) {
        this(alias, LEXEME_GROUP);
    }

    private LexemeGroup(Name alias, Table<LexemeGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private LexemeGroup(Name alias, Table<LexemeGroupRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.LEXEME_GROUP_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LexemeGroupRecord, Long> getIdentity() {
        return Keys.IDENTITY_LEXEME_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LexemeGroupRecord> getPrimaryKey() {
        return Keys.LEXEME_GROUP_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LexemeGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<LexemeGroupRecord>>asList(Keys.LEXEME_GROUP_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<LexemeGroupRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LexemeGroupRecord, ?>>asList(Keys.LEXEME_GROUP__LEXEME_GROUP_LEX_REL_TYPE_CODE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeGroup as(String alias) {
        return new LexemeGroup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeGroup as(Name alias) {
        return new LexemeGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LexemeGroup rename(String name) {
        return new LexemeGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LexemeGroup rename(Name name) {
        return new LexemeGroup(name, null);
    }
}