package data;
import java.util.ArrayList;

/**
 * Class for the GroupChat object as saved in database
 */
public class GroupChat {
    private int groupChatId;
    private String groupChatName;
    private ArrayList<Message> messageList = new ArrayList<>();
    private ArrayList<User> userList = new ArrayList<>();

    public GroupChat() {
    }

    public GroupChat(int groupChatId, String groupChatName) {
        this.groupChatId = groupChatId;
        this.groupChatName = groupChatName;
    }

    public int getGroupChatId() {
        return groupChatId;
    }

    public String getGroupChatName() {
        return groupChatName;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setGroupChatId(int groupChatId) {
        this.groupChatId = groupChatId;
    }

    public void setGroupChatName(String groupChatName) {
        this.groupChatName = groupChatName;
    }

    public void setMessageList(ArrayList<Message> messageList) {
        this.messageList = messageList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
}
