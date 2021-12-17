import java.util.*;

public class Channel implements Comparable<Object> {
    private static Set<String> channelUsers;
    private static String owner;
    private static boolean inviteOnly;
    
    public Channel(String o, Boolean invite) {
        owner = o;
        inviteOnly = invite;
        channelUsers = new TreeSet<>();
        addUser(owner);
    }
    
    public void addUser(String nickname) {
        channelUsers.add(nickname);
    }
    
    
    public void removeUser(String userName) {
        channelUsers.remove(userName);
    }
    
    public boolean containsUser(String name) {
        for (String n : channelUsers) {
            if (n.equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public Collection<String> getOtherUsers(String userName) {
        Collection<String> otherUsers = new TreeSet<String>();
        for (String n : channelUsers) {
            if (!(n.equals(userName))) {
                otherUsers.add(n);
            }
        }
        return otherUsers;
    }
    
    public Set<String> getChannelUsers() {
        return channelUsers;
    }
    
    public String getOwner() {
        return owner;
    }
    
    public void changeOwnerName(String newName) {
        owner = newName;
    }
    
    public boolean isInviteOnly() {
        return inviteOnly;
    }
    
    public void setInvite() {
        inviteOnly = !(inviteOnly);
    }
    
    // method does not do anything
    public int compareTo(Object o) {
        return 0;
    }
}
