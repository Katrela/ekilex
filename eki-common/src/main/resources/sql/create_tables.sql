create table eki_user
(
  id bigserial primary key,
  name text not null,
  email text not null,
  password text not null,
  activation_key varchar(60),
  is_admin boolean default false,
  is_enabled boolean,
  created timestamp not null default statement_timestamp(),
  unique(email)
);
alter sequence eki_user_id_seq restart with 10000;

create table eki_user_application
(
  id bigserial primary key,
  user_id bigint references eki_user(id) on delete cascade not null,
  datasets varchar(10) array null,
  comment text null,
  created timestamp not null default statement_timestamp()
);
alter sequence eki_user_application_id_seq restart with 10000;

---------------------------------
-- klassifitseeritud andmestik --
---------------------------------

-- klassif. nime liik
create table label_type
(
  code varchar(10) primary key,
  value text not null
);

-- keel
create table language
(
  code char(3) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

create table language_label
(
  code char(3) references language(code) on delete cascade not null,
  value text not null,
  lang char(3) references language(code) not null,
  type varchar(10) references label_type(code) not null,
  unique(code, lang, type)
);

-- valdkond
create table domain
(
  code varchar(100) not null,
  origin varchar(100) not null,
  parent_code varchar(100) null,
  parent_origin varchar(100) null,
  datasets varchar(10) array not null,
  order_by bigserial,
  primary key (code, origin),
  foreign key (parent_code, parent_origin) references domain (code, origin)
);

create table domain_label
(
  code varchar(100) not null,
  origin varchar(100) not null,
  value text not null,
  lang char(3) references language(code) not null,
  type varchar(10) references label_type(code) not null,
  foreign key (code, origin) references domain (code, origin),
  unique(code, origin, lang, type)
);

create table value_state
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

create table value_state_label
(
  code varchar(100) references value_state(code) on delete cascade not null,
  value text not null,
  lang char(3) references language(code) not null,
  type varchar(10) references label_type(code) not null,
  unique(code, lang, type)
);

-- klassif. rektsiooni tüüp
create table government_type
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

create table government_type_label
(
  code varchar(100) references government_type(code) on delete cascade not null,
  value text not null,
  lang char(3) references language(code) not null,
  type varchar(10) references label_type(code) not null,
  unique(code, lang, type)
);

-- register
create table register
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

create table register_label
(
  code varchar(100) references register(code) on delete cascade not null,
  value text not null,
  lang char(3) references language(code) not null,
  type varchar(10) references label_type(code) not null,
  unique(code, lang, type)
);

-- sõnasort
create table word_type
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

create table word_type_label
(
  code varchar(100) references word_type(code) on delete cascade not null,
  value text not null,
  lang char(3) references language(code) not null,
  type varchar(10) references label_type(code) not null,
  unique(code, lang, type)
);

-- aspekt
create table aspect
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

create table aspect_label
(
  code varchar(100) references aspect(code) on delete cascade not null,
  value text not null,
  lang char(3) references language(code) not null,
  type varchar(10) references label_type(code) not null,
  unique(code, lang, type)
);

-- sagedusrühm
create table frequency_group
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

-- sugu
create table gender
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

create table gender_label
(
  code varchar(100) references gender(code) on delete cascade not null,
  value text not null,
  lang char(3) references language(code) not null,
  type varchar(10) references label_type(code) not null,
  unique(code, lang, type)
);

-- sõnaliik
create table pos
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

create table pos_label
(
  code varchar(100) references pos(code) on delete cascade not null,
  value text not null,
  lang char(3) references language(code) not null,
  type varchar(10) references label_type(code) not null,
  unique(code, lang, type)
);

-- kol pos grupp
create table pos_group
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

create table pos_group_label
(
  code varchar(100) references pos_group(code) on delete cascade not null,
  value text not null,
  lang char(3) references language(code) not null,
  type varchar(10) references label_type(code) not null,
  unique(code, lang, type)
);

-- vormi märgend
create table morph
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

create table morph_label
(
  code varchar(100) references morph(code) on delete cascade not null,
  value text not null,
  lang char(3) references language(code) not null,
  type varchar(10) references label_type(code) not null,
  unique(code, lang, type)
);

-- kuvatav vormi märgend
create table display_morph
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

create table display_morph_label
(
  code varchar(100) references display_morph(code) on delete cascade not null,
  value text not null,
  lang char(3) references language(code) not null,
  type varchar(10) references label_type(code) not null,
  unique(code, lang, type)
);

-- tuletuskood
create table deriv
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

create table deriv_label
(
  code varchar(100) references deriv(code) on delete cascade not null,
  value text not null,
  lang char(3) references language(code) not null,
  type varchar(10) references label_type(code) not null,
  unique(code, lang, type)
);

-- protsessi staatus
create table process_state
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

-- seose liik
create table lex_rel_type
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

create table lex_rel_type_label
(
  code varchar(100) references lex_rel_type(code) on delete cascade not null,
  value text not null,
  lang char(3) references language(code) not null,
  type varchar(10) references label_type(code) not null,
  unique(code, lang, type)
);

-- ilmiku seose liik
create table word_rel_type
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

create table word_rel_type_label
(
  code varchar(100) references word_rel_type(code) on delete cascade not null,
  value text not null,
  lang char(3) references language(code) not null,
  type varchar(10) references label_type(code) not null,
  unique(code, lang, type)
);

-- tähenduse seose liik
create table meaning_rel_type
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

create table meaning_rel_type_label
(
  code varchar(100) references meaning_rel_type(code) on delete cascade not null,
  value text not null,
  lang char(3) references language(code) not null,
  type varchar(10) references label_type(code) not null,
  unique(code, lang, type)
);

create table usage_type
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

create table usage_type_label
(
  code varchar(100) references usage_type(code) on delete cascade not null,
  value text not null,
  lang char(3) references language(code) not null,
  type varchar(10) references label_type(code) not null,
  unique(code, lang, type)
);

create table etymology_type
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

create table definition_type
(
  code varchar(100) primary key,
  datasets varchar(10) array not null,
  order_by bigserial
);

create table definition_type_label
(
  code varchar(100) references definition_type(code) on delete cascade not null,
  value text not null,
  lang char(3) references language(code) not null,
  type varchar(10) references label_type(code) not null,
  unique(code, lang, type)
);

---------------------------
-- dünaamiline andmestik --
---------------------------

-- olemi elutsükli logi
create table lifecycle_log
(
  id bigserial primary key,
  entity_id bigint not null,
  entity_name text not null,
  entity_prop text not null,
  event_type varchar(100) not null,
  event_by text not null,
  event_on timestamp not null default statement_timestamp(),
  source_name text null,
  recent text null,
  entry text null
);
alter sequence lifecycle_log_id_seq restart with 10000;

-- sõnakogu
create table dataset
(
  code varchar(10) primary key,
  name text not null,
  description text,
  is_public boolean default true,
  order_by bigserial
);

create table dataset_permission
(
  id bigserial primary key,
  dataset_code varchar(10) references dataset(code) on delete cascade not null,
  user_id bigint references eki_user(id) on delete cascade not null,
  auth_operation varchar(100) not null,
  auth_item varchar(100) not null,
  auth_lang char(3) references language(code) null,
  unique(dataset_code, user_id, auth_operation, auth_item, auth_lang)
);
alter sequence dataset_permission_id_seq restart with 10000;

-- vabavorm
create table freeform
(
  id bigserial primary key,
  parent_id bigint references freeform(id) on delete cascade null,
  type varchar(100) not null,
  value_text text null,
  value_prese text null,
  value_date timestamp null,
  value_number numeric(14, 4) null,
  value_array text array null,
  classif_name text null,
  classif_code varchar(100) null,
  lang char(3) references language(code) null,
  process_state_code varchar(100) references process_state(code) null,
  order_by bigserial
);
alter sequence freeform_id_seq restart with 10000;

-- allikas
create table source
(
  id bigserial primary key,
  ext_source_id varchar(100) not null,
  type varchar(100) not null,
  created_on timestamp null,
  created_by varchar(100) null,
  modified_on timestamp null,
  modified_by varchar(100) null,
  process_state_code varchar(100) references process_state(code) null
);
alter sequence source_id_seq restart with 10000;

-- allika vabavorm
create table source_freeform
(
  id bigserial primary key,
  source_id bigint references source(id) on delete cascade not null,
  freeform_id bigint references freeform(id) on delete cascade not null,
  unique(source_id, freeform_id)
);
alter sequence source_freeform_id_seq restart with 10000;

-- keelend (morfoloogiline homonüüm)
create table word
(
  id bigserial primary key,
  lang char(3) references language(code) null,
  morph_code varchar(100) references morph(code) null,
  homonym_nr integer default 1,
  word_class varchar(100) null,
  display_morph_code varchar(100) references display_morph(code) null,
  gender_code varchar(100) references gender(code) null,
  aspect_code varchar(100) references aspect(code) null,
  etymology_year text null,
  etymology_type_code varchar(100) references etymology_type(code) 
);
alter sequence word_id_seq restart with 10000;

create table word_word_type
(
  id bigserial primary key,
  word_id bigint references word(id) on delete cascade not null,
  word_type_code varchar(100) references word_type(code) not null,
  order_by bigserial,
  unique(word_id, word_type_code)
);
alter sequence word_word_type_id_seq restart with 10000;

create table word_guid
(
  id bigserial primary key,
  word_id bigint references word(id) on delete cascade not null,
  guid varchar(100) not null,
  dataset_code varchar(10) references dataset(code) not null,
  unique(word_id, guid, dataset_code)
);
alter sequence word_guid_id_seq restart with 10000;

-- keelendi seos
create table word_relation
(
  id bigserial primary key,
  word1_id bigint references word(id) on delete cascade not null,
  word2_id bigint references word(id) on delete cascade not null,
  word_rel_type_code varchar(100) references word_rel_type(code),
  order_by bigserial,
  unique(word1_id, word2_id, word_rel_type_code)
);
alter sequence word_relation_id_seq restart with 10000;

-- keelendi sari
create table word_group
(
  id bigserial primary key,
  word_rel_type_code varchar(100) references word_rel_type(code) on delete cascade not null
);
alter sequence word_group_id_seq restart with 10000;

create table word_group_member
(
  id bigserial primary key,
  word_group_id bigint references word_group(id) on delete cascade not null,
  word_id bigint references word(id) on delete cascade not null,
  order_by bigserial,
  unique(word_group_id, word_id)
);
alter sequence word_group_member_id_seq restart with 10000;

create table word_etymology
(
  id bigserial primary key,
  word1_id bigint references word(id) on delete cascade not null,
  word2_id bigint references word(id) on delete cascade not null,
  comments text array null,
  is_questionable boolean not null default false,
  is_compound boolean not null default false,
  order_by bigserial,
  unique(word1_id, word2_id)
);
alter sequence word_etymology_id_seq restart with 10000;

create table word_lifecycle_log
(
  id bigserial primary key,
  word_id bigint references word(id) on delete cascade not null,
  lifecycle_log_id bigint references lifecycle_log(id) on delete cascade not null
);
alter sequence word_lifecycle_log_id_seq restart with 10000;

-- paradigma
create table paradigm
(
  id bigserial primary key,
  word_id bigint references word(id) on delete cascade not null,
  example text null,
  inflection_type_nr varchar(100),
  inflection_type varchar(100),
  is_secondary boolean default false
);
alter sequence paradigm_id_seq restart with 10000;

-- vorm
create table form
(
  id bigserial primary key,
  paradigm_id bigint references paradigm(id) on delete cascade not null,
  mode varchar(100) not null,
  morph_group1 text null,
  morph_group2 text null,
  morph_group3 text null,
  display_level integer not null default 1,
  morph_code varchar(100) references morph(code) not null,
  morph_exists boolean not null,
  value text not null,
  value_prese text not null,
  components varchar(100) array null,
  display_form varchar(255) null,
  vocal_form varchar(255) null,
  sound_file varchar(255) null,
  order_by integer not null default 0
);
alter sequence form_id_seq restart with 10000;

create table form_frequency
(
  id bigserial primary key,
  source_name text not null,
  created_on timestamp not null default statement_timestamp(),
  word_value text not null,
  morph_code varchar(100) references morph(code) not null,
  form_value text not null,
  rank bigint not null,
  value numeric(12, 7) not null
);
alter sequence form_frequency_id_seq restart with 10000;

-- tähendus
create table meaning
(
  id bigserial primary key,
  created_on timestamp null,
  created_by varchar(100) null,
  modified_on timestamp null,
  modified_by varchar(100) null,
  process_state_code varchar(100) references process_state(code) null
);
alter sequence meaning_id_seq restart with 10000;

create table meaning_nr
(
  id bigserial primary key,
  meaning_id bigint references meaning(id) on delete cascade not null,
  mnr varchar(100) not null,
  dataset_code varchar(10) references dataset(code) not null,
  unique(meaning_id, mnr, dataset_code)
);
alter sequence meaning_nr_id_seq restart with 10000;

-- tähenduse seos
create table meaning_relation
(
  id bigserial primary key,
  meaning1_id bigint references meaning(id) on delete cascade not null,
  meaning2_id bigint references meaning(id) on delete cascade not null,
  meaning_rel_type_code varchar(100) references meaning_rel_type(code) on delete cascade not null,
  process_state_code varchar(100) references process_state(code) null,
  order_by bigserial,
  unique(meaning1_id, meaning2_id, meaning_rel_type_code)
);
alter sequence meaning_relation_id_seq restart with 10000;

create table meaning_domain
(
  id bigserial primary key,
  meaning_id bigint references meaning(id) on delete cascade not null,
  domain_code varchar(100) not null,
  domain_origin varchar(100) not null,
  order_by bigserial,
  process_state_code varchar(100) references process_state(code) null,
  foreign key (domain_code, domain_origin) references domain (code, origin),
  unique(meaning_id, domain_code, domain_origin)
);
alter sequence meaning_domain_id_seq restart with 10000;

create table meaning_lifecycle_log
(
  id bigserial primary key,
  meaning_id bigint references meaning(id) on delete cascade not null,
  lifecycle_log_id bigint references lifecycle_log(id) on delete cascade not null
);
alter sequence meaning_lifecycle_log_id_seq restart with 10000;

-- tähenduse vabavorm
create table meaning_freeform
(
  id bigserial primary key,
  meaning_id bigint references meaning(id) on delete cascade not null,
  freeform_id bigint references freeform(id) on delete cascade not null,
  unique(meaning_id, freeform_id)
);
alter sequence meaning_freeform_id_seq restart with 10000;

-- seletus
create table definition
(
  id bigserial primary key,
  meaning_id bigint references meaning(id) not null,
  value text not null,
  value_prese text not null,
  lang char(3) references language(code) not null,
  definition_type_code varchar(100) references definition_type(code) not null,
  process_state_code varchar(100) references process_state(code) null,
  order_by bigserial
);
alter sequence definition_id_seq restart with 10000;

create table definition_dataset
(
  definition_id bigint references definition(id) on delete cascade not null,
  dataset_code varchar(10) references dataset(code) not null,
  primary key (definition_id, dataset_code)
);

-- seletuse vabavorm
create table definition_freeform
(
  id bigserial primary key,
  definition_id bigint references definition(id) on delete cascade not null,
  freeform_id bigint references freeform(id) on delete cascade not null,
  unique(definition_id, freeform_id)
);
alter sequence definition_freeform_id_seq restart with 10000;

-- kollokatsioon
create table collocation
(
  id bigserial primary key,
  value text not null,
  definition text,
  frequency numeric(14, 4),
  score numeric(14, 4),
  usages text array,
  target_context varchar(100) not null
);
alter sequence collocation_id_seq restart with 10000;

-- kollokatsiooni vabavorm
create table collocation_freeform
(
  id bigserial primary key,
  collocation_id bigint references collocation(id) on delete cascade not null,
  freeform_id bigint references freeform(id) on delete cascade not null,
  unique(collocation_id, freeform_id)
);
alter sequence collocation_freeform_id_seq restart with 10000;

-- ilmik
create table lexeme
(
  id bigserial primary key,
  word_id bigint references word(id) not null,
  meaning_id bigint references meaning(id) not null,
  dataset_code varchar(10) references dataset(code) not null,
  created_on timestamp null,
  created_by varchar(100) null,
  modified_on timestamp null,
  modified_by varchar(100) null,
  frequency_group_code varchar(100) references frequency_group(code) null,
  corpus_frequency numeric,--TODO will be moved to lexeme_frequency table later
  level1 integer default 0,
  level2 integer default 0,
  level3 integer default 0,
  value_state_code varchar(100) references value_state(code) null,
  process_state_code varchar(100) references process_state(code) null,
  order_by bigserial,
  unique(word_id, meaning_id, dataset_code)
);
alter sequence lexeme_id_seq restart with 10000;

create table lexeme_frequency
(
  id bigserial primary key,
  lexeme_id bigint references lexeme(id) on delete cascade not null,
  source_name text not null,
  created_on timestamp not null default statement_timestamp(),
  rank bigint not null,
  value numeric(12, 7) not null,
  unique (lexeme_id, source_name)
);
alter sequence lexeme_frequency_id_seq restart with 10000;

create table lexeme_register
(
  id bigserial primary key,
  lexeme_id bigint references lexeme(id) on delete cascade not null,
  register_code varchar(100) references register(code) not null,
  process_state_code varchar(100) references process_state(code) null,
  order_by bigserial,
  unique(lexeme_id, register_code)
);
alter sequence lexeme_register_id_seq restart with 10000;

create table lexeme_pos
(
  id bigserial primary key,
  lexeme_id bigint references lexeme(id) on delete cascade not null,
  pos_code varchar(100) references pos(code) not null,
  process_state_code varchar(100) references process_state(code) null,
  order_by bigserial,
  unique(lexeme_id, pos_code)
);
alter sequence lexeme_pos_id_seq restart with 10000;

create table lexeme_deriv
(
  id bigserial primary key,
  lexeme_id bigint references lexeme(id) on delete cascade not null,
  deriv_code varchar(100) references deriv(code) not null,
  process_state_code varchar(100) references process_state(code) null,
  unique(lexeme_id, deriv_code)
);
alter sequence lexeme_deriv_id_seq restart with 10000;

-- ilmiku vabavorm
create table lexeme_freeform
(
  id bigserial primary key,
  lexeme_id bigint references lexeme(id) on delete cascade not null,
  freeform_id bigint references freeform(id) on delete cascade not null,
  unique(lexeme_id, freeform_id)
);
alter sequence lexeme_freeform_id_seq restart with 10000;

create table lexeme_lifecycle_log
(
  id bigserial primary key,
  lexeme_id bigint references lexeme(id) on delete cascade not null,
  lifecycle_log_id bigint references lifecycle_log(id) on delete cascade not null
);
alter sequence lexeme_lifecycle_log_id_seq restart with 10000;

-- ilmiku seos
create table lex_relation
(
  id bigserial primary key,
  lexeme1_id bigint references lexeme(id) on delete cascade not null,
  lexeme2_id bigint references lexeme(id) on delete cascade not null,
  lex_rel_type_code varchar(100) references lex_rel_type(code) on delete cascade not null,
  process_state_code varchar(100) references process_state(code) null,
  order_by bigserial,
  unique(lexeme1_id, lexeme2_id, lex_rel_type_code)
);
alter sequence lex_relation_id_seq restart with 10000;

-- ilmiku kollokatsiooni grupid
create table lex_colloc_pos_group
(
  id bigserial primary key,
  lexeme_id bigint references lexeme(id) on delete cascade not null,
  pos_group_code varchar(100) references pos_group(code) on delete cascade not null,
  order_by bigserial
);
alter sequence lex_colloc_pos_group_id_seq restart with 10000;

create table lex_colloc_rel_group
(
  id bigserial primary key,
  pos_group_id bigint references lex_colloc_pos_group(id) on delete cascade not null,
  name text not null,
  frequency numeric(14, 4),
  score numeric(14, 4),
  order_by bigserial
);
alter sequence lex_colloc_rel_group_id_seq restart with 10000;

-- ilmiku kollokatsioon
create table lex_colloc
(
  id bigserial primary key,
  lexeme_id bigint references lexeme(id) on delete cascade not null,
  rel_group_id bigint references lex_colloc_rel_group(id) on delete cascade null,
  collocation_id bigint references collocation(id) on delete cascade not null,
  member_form text not null,
  conjunct varchar(100) null,
  weight numeric(14, 4),
  member_order integer not null,
  group_order integer,
  unique(lexeme_id, collocation_id)
);
alter sequence lex_colloc_id_seq restart with 10000;

-- allikaviited
create table freeform_source_link
(
  id bigserial primary key,
  freeform_id bigint references freeform(id) on delete cascade not null,
  source_id bigint references source(id) on delete cascade not null,
  type varchar(100) not null,
  name text null,
  value text null,
  process_state_code varchar(100) references process_state(code) null,
  order_by bigserial
);
alter sequence freeform_source_link_id_seq restart with 10000;

create table definition_source_link
(
  id bigserial primary key,
  definition_id bigint references definition(id) on delete cascade not null,
  source_id bigint references source(id) on delete cascade not null,
  type varchar(100) not null,
  name text null,
  value text null,
  process_state_code varchar(100) references process_state(code) null,
  order_by bigserial
);
alter sequence definition_source_link_id_seq restart with 10000;

create table lexeme_source_link
(
  id bigserial primary key,
  lexeme_id bigint references lexeme(id) on delete cascade not null,
  source_id bigint references source(id) on delete cascade not null,
  type varchar(100) not null,
  name text null,
  value text null,
  process_state_code varchar(100) references process_state(code) null,
  order_by bigserial
);
alter sequence lexeme_source_link_id_seq restart with 10000;

create table word_source_link
(
  id bigserial primary key,
  word_id bigint references word(id) on delete cascade not null,
  source_id bigint references source(id) on delete cascade not null,
  type varchar(100) not null,
  name text null,
  value text null,
  process_state_code varchar(100) references process_state(code) null,
  order_by bigserial
);
alter sequence word_source_link_id_seq restart with 10000;

create table game_nonword
(
  id bigserial primary key,
  word text not null,
  lang char(3) references language(code) not null,
  unique(word, lang)
);

create table feedback_log
(
  id bigserial primary key,
  feedback_type varchar(100) not null,
  sender_name text not null,
  sender_email text not null,
  created_on timestamp not null default statement_timestamp(),
  word text not null,
  definition text null,
  comments text null,
  usages text null,
  other_info text null,
  last_search text null
);
alter sequence feedback_log_id_seq restart with 10000;

create table feedback_log_comment
(
  id bigserial primary key,
  feedback_log_id bigint references feedback_log(id) on delete cascade not null,
  comment text,
  user_name text not null,
  created_on timestamp not null default statement_timestamp()
);
alter sequence feedback_log_comment_id_seq restart with 10000;

--- indexes
create index dataset_perm_dataset_code_idx on dataset_permission(dataset_code);
create index dataset_perm_user_id_idx on dataset_permission(user_id);
create index form_value_idx on form(value);
create index form_value_lower_idx on form(lower(value));
create index form_value_lower_prefix_idx on form (lower(value) text_pattern_ops);
create index form_morph_code_idx on form(morph_code);
create index form_mode_idx on form(mode);
create index form_value_mode_idx on form(value, mode);
create index form_paradigm_id_idx on form(paradigm_id);
create index form_frequency_source_name_idx on form_frequency(source_name);
create index form_frequency_word_value_idx on form_frequency(word_value);
create index form_frequency_morph_code_idx on form_frequency(morph_code);
create index form_frequency_form_value_idx on form_frequency(form_value);
create index paradigm_word_id_idx on paradigm(word_id);
create index word_homonym_nr_idx on word(homonym_nr);
create index word_lang_idx on word(lang);
create index word_etym_type_code_idx on word(etymology_type_code);
create index word_etym_word1_id_idx on word_etymology(word1_id);
create index word_etym_word2_id_idx on word_etymology(word2_id);
create index word_guid_word_id_idx on word_guid(word_id);
create index word_guid_dataset_code_idx on word_guid(dataset_code);
create index word_guid_guid_idx on word_guid(guid);
create index word_group_member_group_id_idx on word_group_member(word_group_id);
create index word_group_member_word_id_idx on word_group_member(word_id);
create index meaning_nr_meaning_id_idx on meaning_nr(meaning_id);
create index meaning_nr_dataset_code_idx on meaning_nr(dataset_code);
create index meaning_nr_mnr_idx on meaning_nr(mnr);
create index lexeme_word_id_idx on lexeme(word_id);
create index lexeme_meaning_id_idx on lexeme(meaning_id);
create index lexeme_dataset_code_idx on lexeme(dataset_code);
create index definition_meaning_id_idx on definition(meaning_id);
create index meaning_relation_meaning1_id_idx on meaning_relation(meaning1_id);
create index meaning_relation_meaning2_id_idx on meaning_relation(meaning2_id);
create index lex_relation_lexeme1_id_idx on lex_relation(lexeme1_id);
create index lex_relation_lexeme2_id_idx on lex_relation(lexeme2_id);
create index word_relation_word1_id_idx on word_relation(word1_id);
create index word_relation_word2_id_idx on word_relation(word2_id);
create index freeform_parent_id_idx on freeform(parent_id);
create index freeform_value_text_idx on freeform(value_text);
create index freeform_type_idx on freeform(type);
create index source_ext_source_id_idx on source(ext_source_id);
create index source_type_idx on source(type);
create index source_freeform_source_id_idx on source_freeform(source_id);
create index source_freeform_freeform_id_idx on source_freeform(freeform_id);
create index meaning_freeform_meaning_id_idx on meaning_freeform(meaning_id);
create index meaning_freeform_freeform_id_idx on meaning_freeform(freeform_id);
create index lexeme_freeform_lexeme_id_idx on lexeme_freeform(lexeme_id);
create index lexeme_freeform_freeform_id_idx on lexeme_freeform(freeform_id);
create index definition_freeform_definition_id_idx on definition_freeform(definition_id);
create index definition_freeform_freeform_id_idx on definition_freeform(freeform_id);
create index collocation_freeform_collocation_id_idx on collocation_freeform(collocation_id);
create index collocation_freeform_freeform_id_idx on collocation_freeform(freeform_id);
create index freeform_source_link_freeform_id_idx on freeform_source_link(freeform_id);
create index freeform_source_link_source_id_idx on freeform_source_link(source_id);
create index definition_source_link_definition_id_idx on definition_source_link(definition_id);
create index definition_source_link_source_id_idx on definition_source_link(source_id);
create index lexeme_source_link_lexeme_id_idx on lexeme_source_link(lexeme_id);
create index lexeme_source_link_source_id_idx on lexeme_source_link(source_id);
create index word_source_link_word_id_idx on word_source_link(word_id);
create index word_source_link_source_id_idx on word_source_link(source_id);
create index lex_colloc_pos_group_lexeme_id_idx on lex_colloc_pos_group(lexeme_id);
create index lex_colloc_rel_group_pos_group_id_idx on lex_colloc_rel_group(pos_group_id);
create index lex_colloc_lexeme_id_idx on lex_colloc(lexeme_id);
create index lex_colloc_rel_group_id_idx on lex_colloc(rel_group_id);
create index lex_colloc_collocation_id_idx on lex_colloc(collocation_id);
create index lexeme_frequency_lexeme_id_idx on lexeme_frequency(lexeme_id);
create index lexeme_frequency_source_name_idx on lexeme_frequency(source_name);
create index lexeme_register_lexeme_id_idx on lexeme_register(lexeme_id);
create index lexeme_pos_lexeme_id_idx on lexeme_pos(lexeme_id);
create index lexeme_pos_pos_code_idx on lexeme_pos(pos_code);
create index lexeme_deriv_lexeme_id_idx on lexeme_deriv(lexeme_id);
create index meaning_domain_lexeme_id_idx on meaning_domain(meaning_id);
create index word_lifecycle_log_word_id_idx on word_lifecycle_log(word_id);
create index word_lifecycle_log_log_id_idx on word_lifecycle_log(lifecycle_log_id);
create index meaning_lifecycle_log_meaning_id_idx on meaning_lifecycle_log(meaning_id);
create index meaning_lifecycle_log_log_id_idx on meaning_lifecycle_log(lifecycle_log_id);
create index lexeme_lifecycle_log_lexeme_id_idx on lexeme_lifecycle_log(lexeme_id);
create index lexeme_lifecycle_log_log_id_idx on lexeme_lifecycle_log(lifecycle_log_id);
create index feedback_log_comment_log_id_idx on feedback_log_comment(feedback_log_id);

create index definition_fts_idx on definition using gin(to_tsvector('simple',value));
create index freeform_fts_idx on freeform using gin(to_tsvector('simple',value_text));
create index form_fts_idx on form using gin(to_tsvector('simple',value));
