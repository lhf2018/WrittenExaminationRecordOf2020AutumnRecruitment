select t.name from t_score t
where ((t.math!>60 and t.chinese!>60)
or (t.math!>60 and t.english!>60)
or (t.chinese!>60 and t.english!>60))