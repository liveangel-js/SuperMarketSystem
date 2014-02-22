/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mscs.data;

/**
 *
 * @author luhui
 */
public class MemberRecord extends Record{
    private String uname;
    
    public MemberRecord(){
        
    }

    public MemberRecord(String uname,int uid){
        this.uname = uname;
        this.id = uid;
    }
    
    public int getUid() {
        return id;
    }

    public void setUid(int uid) {
        this.id = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    
}
