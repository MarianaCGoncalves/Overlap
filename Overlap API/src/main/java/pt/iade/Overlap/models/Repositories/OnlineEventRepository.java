package pt.iade.Overlap.models.Repositories;




import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.Overlap.models.OnlineEvent;
import pt.iade.Overlap.models.views.OnlineEventEveView; 
 
public interface OnlineEventRepository extends CrudRepository<OnlineEvent,Integer> {

        String getAllInfoOnlineEvents = "select use_name as username, eve_on_id as eventonlineid, eve_on_ug_id as eventonlineusergroupid, "
        +"eve_on_eve_id as eventonlineeventid, eve_on_dt as eventonlinedate, eve_id as eventid, "
        +"eve_name as eventname, eve_ug_id as eventusergroupid, eve_desc as eventdescription, "
        +"eve_date as eventtimestamp, eve_evt_id as eventtype, ug_id as usergroupid, "
        +"ug_use_id as usergroupuserid, gru_id as groupid, gru_use_id as groupuserid, "
        +"gru_name as groupname, gru_desc as groupdescription, gru_create_age as groupbirthday, "
        +"gru_last_post_age as lastpost, gru_at as groupactivity "
        +"from eveonline, eventos, usergroup, grupos, users where eve_on_eve_id = eve_id "
        +"and eve_ug_id = ug_id and use_id = ug_use_id and and ug_gru_id = gru_id";

        @Query(value = getAllInfoOnlineEvents, nativeQuery = true)
        Iterable<OnlineEventEveView> getOnlineEvents();

        @Query(value = getAllInfoOnlineEvents + "and gru_id = :id ", nativeQuery = true)
        Iterable<OnlineEventEveView> getOnlineEventsByGroup(@Param("id") int id);

        @Query(value = getAllInfoOnlineEvents + " and gru_name like :name", nativeQuery = true)
        Iterable<OnlineEventEveView> getOnlineEventsByGroupName(@Param("name") String name);
     } 
