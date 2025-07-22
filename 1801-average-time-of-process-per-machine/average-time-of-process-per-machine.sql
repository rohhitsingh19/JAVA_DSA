select machine_id, 
        round(
            avg(
                CASE
                    when activity_type = 'start' THEN - timestamp
                    else timestamp
                    end):: decimal * 2
                    , 3) as processing_time
from Activity
group by machine_id
order by machine_id asc;
