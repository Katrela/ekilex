-- search words by components prefix
select f.paradigm_id,
       f.value word,
       f.components
from (select f.paradigm_id,
             f.value,
             f.components,
             unnest(f.components) component
      from form f
      where f.mode = 'WORD') f
where f.component like :compPrefix;
