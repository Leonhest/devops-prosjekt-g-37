package resources;

import dao.GroupChatDAO;
import data.GroupChat;
import data.Message;
import data.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * GroupChat resource exposed at "/groupchat" path
 */
@Path("/groupchat")
public class GroupChatResource {

    /**
     * GET method to get one groupchat with specified groupChatId
     * @param groupChatId of the chat to GET
     * @return GroupChat
     */
    @GET
    @Path ("{groupChatId}")
    @Produces (MediaType.APPLICATION_JSON)
    public GroupChat getGroupChat(@PathParam("groupChatId") int groupChatId){
        return null;
    }

    @GET
    @Path("user/{userId}")
    @Produces (MediaType.APPLICATION_JSON)
    public ArrayList<GroupChat> getGroupChatByUser(@PathParam("userId") int userId ){
        GroupChatDAO groupChatDAO = new GroupChatDAO();
        return groupChatDAO.getGroupChatByUserId(userId);
    }

    @POST
    @Produces (MediaType.APPLICATION_JSON)
    @Consumes (MediaType.APPLICATION_JSON)
    public GroupChat postGroupChat(GroupChat groupChat){
        GroupChatDAO groupChatDAO = new GroupChatDAO();
        return groupChatDAO.addGroupChat(groupChat);
    }

    @GET
    @Path("{groupChatId}/message")
    @Produces (MediaType.APPLICATION_JSON)
    public ArrayList<Message> getGroupChatById(@PathParam("groupChatId") int groupChatId){
        GroupChatDAO groupChatDAO = new GroupChatDAO();
        return groupChatDAO.getGroupChatMessages(groupChatId);
    }


    @POST
    @Path("{groupChatId}/message")
    @Produces (MediaType.APPLICATION_JSON)
    @Consumes (MediaType.APPLICATION_JSON)
    public Message postMessage(@PathParam("groupChatId") int groupChatId, Message message){
        GroupChatDAO groupChatDAO = new GroupChatDAO();
        return groupChatDAO.addMessage(groupChatId,message);
    }


}
