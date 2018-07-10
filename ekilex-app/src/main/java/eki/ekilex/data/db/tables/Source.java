/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.SourceRecord;

import java.sql.Timestamp;
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
public class Source extends TableImpl<SourceRecord> {

    private static final long serialVersionUID = 1513979372;

    /**
     * The reference instance of <code>public.source</code>
     */
    public static final Source SOURCE = new Source();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SourceRecord> getRecordType() {
        return SourceRecord.class;
    }

    /**
     * The column <code>public.source.id</code>.
     */
    public final TableField<SourceRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('source_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.source.ext_source_id</code>.
     */
    public final TableField<SourceRecord, String> EXT_SOURCE_ID = createField("ext_source_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.source.created_on</code>.
     */
    public final TableField<SourceRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.source.created_by</code>.
     */
    public final TableField<SourceRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.source.modified_on</code>.
     */
    public final TableField<SourceRecord, Timestamp> MODIFIED_ON = createField("modified_on", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.source.modified_by</code>.
     */
    public final TableField<SourceRecord, String> MODIFIED_BY = createField("modified_by", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.source.type</code>.
     */
    public final TableField<SourceRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.source.process_state_code</code>.
     */
    public final TableField<SourceRecord, String> PROCESS_STATE_CODE = createField("process_state_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * Create a <code>public.source</code> table reference
     */
    public Source() {
        this(DSL.name("source"), null);
    }

    /**
     * Create an aliased <code>public.source</code> table reference
     */
    public Source(String alias) {
        this(DSL.name(alias), SOURCE);
    }

    /**
     * Create an aliased <code>public.source</code> table reference
     */
    public Source(Name alias) {
        this(alias, SOURCE);
    }

    private Source(Name alias, Table<SourceRecord> aliased) {
        this(alias, aliased, null);
    }

    private Source(Name alias, Table<SourceRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.SOURCE_EXT_SOURCE_ID_IDX, Indexes.SOURCE_PKEY, Indexes.SOURCE_TYPE_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SourceRecord, Long> getIdentity() {
        return Keys.IDENTITY_SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SourceRecord> getPrimaryKey() {
        return Keys.SOURCE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SourceRecord>> getKeys() {
        return Arrays.<UniqueKey<SourceRecord>>asList(Keys.SOURCE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<SourceRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SourceRecord, ?>>asList(Keys.SOURCE__SOURCE_PROCESS_STATE_CODE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Source as(String alias) {
        return new Source(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Source as(Name alias) {
        return new Source(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Source rename(String name) {
        return new Source(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Source rename(Name name) {
        return new Source(name, null);
    }
}
