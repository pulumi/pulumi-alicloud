// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.directmail.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMailAddressesAddress {
    /**
     * @return The sender address.
     * 
     */
    private final String accountName;
    /**
     * @return The creation of the record time.
     * 
     */
    private final String createTime;
    /**
     * @return On the quota limit.
     * 
     */
    private final String dailyCount;
    /**
     * @return On the quota.
     * 
     */
    private final String dailyReqCount;
    /**
     * @return Domain name status. Valid values: `0`, `1`.
     * 
     */
    private final String domainStatus;
    /**
     * @return The ID of the Mail Address.
     * 
     */
    private final String id;
    /**
     * @return The sender address ID.
     * 
     */
    private final String mailAddressId;
    /**
     * @return Monthly quota limit.
     * 
     */
    private final String monthCount;
    /**
     * @return Months amount.
     * 
     */
    private final String monthReqCount;
    /**
     * @return Return address.
     * 
     */
    private final String replyAddress;
    /**
     * @return If using STMP address status.
     * 
     */
    private final String replyStatus;
    /**
     * @return Account type.
     * 
     */
    private final String sendtype;
    /**
     * @return Account Status. Valid values: `0`, `1`. Freeze: 1, normal: 0.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetMailAddressesAddress(
        @CustomType.Parameter("accountName") String accountName,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("dailyCount") String dailyCount,
        @CustomType.Parameter("dailyReqCount") String dailyReqCount,
        @CustomType.Parameter("domainStatus") String domainStatus,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("mailAddressId") String mailAddressId,
        @CustomType.Parameter("monthCount") String monthCount,
        @CustomType.Parameter("monthReqCount") String monthReqCount,
        @CustomType.Parameter("replyAddress") String replyAddress,
        @CustomType.Parameter("replyStatus") String replyStatus,
        @CustomType.Parameter("sendtype") String sendtype,
        @CustomType.Parameter("status") String status) {
        this.accountName = accountName;
        this.createTime = createTime;
        this.dailyCount = dailyCount;
        this.dailyReqCount = dailyReqCount;
        this.domainStatus = domainStatus;
        this.id = id;
        this.mailAddressId = mailAddressId;
        this.monthCount = monthCount;
        this.monthReqCount = monthReqCount;
        this.replyAddress = replyAddress;
        this.replyStatus = replyStatus;
        this.sendtype = sendtype;
        this.status = status;
    }

    /**
     * @return The sender address.
     * 
     */
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return The creation of the record time.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return On the quota limit.
     * 
     */
    public String dailyCount() {
        return this.dailyCount;
    }
    /**
     * @return On the quota.
     * 
     */
    public String dailyReqCount() {
        return this.dailyReqCount;
    }
    /**
     * @return Domain name status. Valid values: `0`, `1`.
     * 
     */
    public String domainStatus() {
        return this.domainStatus;
    }
    /**
     * @return The ID of the Mail Address.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The sender address ID.
     * 
     */
    public String mailAddressId() {
        return this.mailAddressId;
    }
    /**
     * @return Monthly quota limit.
     * 
     */
    public String monthCount() {
        return this.monthCount;
    }
    /**
     * @return Months amount.
     * 
     */
    public String monthReqCount() {
        return this.monthReqCount;
    }
    /**
     * @return Return address.
     * 
     */
    public String replyAddress() {
        return this.replyAddress;
    }
    /**
     * @return If using STMP address status.
     * 
     */
    public String replyStatus() {
        return this.replyStatus;
    }
    /**
     * @return Account type.
     * 
     */
    public String sendtype() {
        return this.sendtype;
    }
    /**
     * @return Account Status. Valid values: `0`, `1`. Freeze: 1, normal: 0.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMailAddressesAddress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String createTime;
        private String dailyCount;
        private String dailyReqCount;
        private String domainStatus;
        private String id;
        private String mailAddressId;
        private String monthCount;
        private String monthReqCount;
        private String replyAddress;
        private String replyStatus;
        private String sendtype;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMailAddressesAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.createTime = defaults.createTime;
    	      this.dailyCount = defaults.dailyCount;
    	      this.dailyReqCount = defaults.dailyReqCount;
    	      this.domainStatus = defaults.domainStatus;
    	      this.id = defaults.id;
    	      this.mailAddressId = defaults.mailAddressId;
    	      this.monthCount = defaults.monthCount;
    	      this.monthReqCount = defaults.monthReqCount;
    	      this.replyAddress = defaults.replyAddress;
    	      this.replyStatus = defaults.replyStatus;
    	      this.sendtype = defaults.sendtype;
    	      this.status = defaults.status;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder dailyCount(String dailyCount) {
            this.dailyCount = Objects.requireNonNull(dailyCount);
            return this;
        }
        public Builder dailyReqCount(String dailyReqCount) {
            this.dailyReqCount = Objects.requireNonNull(dailyReqCount);
            return this;
        }
        public Builder domainStatus(String domainStatus) {
            this.domainStatus = Objects.requireNonNull(domainStatus);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder mailAddressId(String mailAddressId) {
            this.mailAddressId = Objects.requireNonNull(mailAddressId);
            return this;
        }
        public Builder monthCount(String monthCount) {
            this.monthCount = Objects.requireNonNull(monthCount);
            return this;
        }
        public Builder monthReqCount(String monthReqCount) {
            this.monthReqCount = Objects.requireNonNull(monthReqCount);
            return this;
        }
        public Builder replyAddress(String replyAddress) {
            this.replyAddress = Objects.requireNonNull(replyAddress);
            return this;
        }
        public Builder replyStatus(String replyStatus) {
            this.replyStatus = Objects.requireNonNull(replyStatus);
            return this;
        }
        public Builder sendtype(String sendtype) {
            this.sendtype = Objects.requireNonNull(sendtype);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetMailAddressesAddress build() {
            return new GetMailAddressesAddress(accountName, createTime, dailyCount, dailyReqCount, domainStatus, id, mailAddressId, monthCount, monthReqCount, replyAddress, replyStatus, sendtype, status);
        }
    }
}