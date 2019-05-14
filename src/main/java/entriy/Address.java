package entriy;

public class Address {
    private Integer id;
    private String address;//地址
    private String realname;//正真的姓名
    private String mobile;//移动电话
    private String zipCode;//邮政编号
    private String createTime;//添加的时间
    private User user;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getRealname() {
        return realname;
    }

    public String getMobile() {
        return mobile;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCreateTime() {
        return createTime;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", realname='" + realname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
