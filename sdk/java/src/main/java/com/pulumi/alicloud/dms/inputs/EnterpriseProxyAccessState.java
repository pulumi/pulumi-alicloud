// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnterpriseProxyAccessState extends com.pulumi.resources.ResourceArgs {

    public static final EnterpriseProxyAccessState Empty = new EnterpriseProxyAccessState();

    /**
     * The authorized account of the security agent.
     * 
     */
    @Import(name="accessId")
    private @Nullable Output<String> accessId;

    /**
     * @return The authorized account of the security agent.
     * 
     */
    public Optional<Output<String>> accessId() {
        return Optional.ofNullable(this.accessId);
    }

    /**
     * Secure access agent authorization password.
     * 
     */
    @Import(name="accessSecret")
    private @Nullable Output<String> accessSecret;

    /**
     * @return Secure access agent authorization password.
     * 
     */
    public Optional<Output<String>> accessSecret() {
        return Optional.ofNullable(this.accessSecret);
    }

    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Database account.
     * 
     */
    @Import(name="indepAccount")
    private @Nullable Output<String> indepAccount;

    /**
     * @return Database account.
     * 
     */
    public Optional<Output<String>> indepAccount() {
        return Optional.ofNullable(this.indepAccount);
    }

    /**
     * Database password.
     * 
     */
    @Import(name="indepPassword")
    private @Nullable Output<String> indepPassword;

    /**
     * @return Database password.
     * 
     */
    public Optional<Output<String>> indepPassword() {
        return Optional.ofNullable(this.indepPassword);
    }

    /**
     * The ID of the instance.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The ID of the instance.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The source information of the security access agent permission is enabled, and the return value is as follows:
     * * **Owner Authorization**: The UID of the owner in parentheses.
     * * **Work Order Authorization**: The ticket number in parentheses is the number of the user to apply for permission.
     * 
     */
    @Import(name="originInfo")
    private @Nullable Output<String> originInfo;

    /**
     * @return The source information of the security access agent permission is enabled, and the return value is as follows:
     * * **Owner Authorization**: The UID of the owner in parentheses.
     * * **Work Order Authorization**: The ticket number in parentheses is the number of the user to apply for permission.
     * 
     */
    public Optional<Output<String>> originInfo() {
        return Optional.ofNullable(this.originInfo);
    }

    /**
     * Security Protection authorization ID. After the target user is authorized by the security protection agent, the system automatically generates a security protection authorization ID, which is globally unique.
     * 
     */
    @Import(name="proxyAccessId")
    private @Nullable Output<String> proxyAccessId;

    /**
     * @return Security Protection authorization ID. After the target user is authorized by the security protection agent, the system automatically generates a security protection authorization ID, which is globally unique.
     * 
     */
    public Optional<Output<String>> proxyAccessId() {
        return Optional.ofNullable(this.proxyAccessId);
    }

    /**
     * The ID of the security agent.
     * 
     */
    @Import(name="proxyId")
    private @Nullable Output<String> proxyId;

    /**
     * @return The ID of the security agent.
     * 
     */
    public Optional<Output<String>> proxyId() {
        return Optional.ofNullable(this.proxyId);
    }

    /**
     * The user ID.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return The user ID.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    /**
     * User nickname.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return User nickname.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    /**
     * User UID.
     * 
     */
    @Import(name="userUid")
    private @Nullable Output<String> userUid;

    /**
     * @return User UID.
     * 
     */
    public Optional<Output<String>> userUid() {
        return Optional.ofNullable(this.userUid);
    }

    private EnterpriseProxyAccessState() {}

    private EnterpriseProxyAccessState(EnterpriseProxyAccessState $) {
        this.accessId = $.accessId;
        this.accessSecret = $.accessSecret;
        this.createTime = $.createTime;
        this.indepAccount = $.indepAccount;
        this.indepPassword = $.indepPassword;
        this.instanceId = $.instanceId;
        this.originInfo = $.originInfo;
        this.proxyAccessId = $.proxyAccessId;
        this.proxyId = $.proxyId;
        this.userId = $.userId;
        this.userName = $.userName;
        this.userUid = $.userUid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnterpriseProxyAccessState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnterpriseProxyAccessState $;

        public Builder() {
            $ = new EnterpriseProxyAccessState();
        }

        public Builder(EnterpriseProxyAccessState defaults) {
            $ = new EnterpriseProxyAccessState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessId The authorized account of the security agent.
         * 
         * @return builder
         * 
         */
        public Builder accessId(@Nullable Output<String> accessId) {
            $.accessId = accessId;
            return this;
        }

        /**
         * @param accessId The authorized account of the security agent.
         * 
         * @return builder
         * 
         */
        public Builder accessId(String accessId) {
            return accessId(Output.of(accessId));
        }

        /**
         * @param accessSecret Secure access agent authorization password.
         * 
         * @return builder
         * 
         */
        public Builder accessSecret(@Nullable Output<String> accessSecret) {
            $.accessSecret = accessSecret;
            return this;
        }

        /**
         * @param accessSecret Secure access agent authorization password.
         * 
         * @return builder
         * 
         */
        public Builder accessSecret(String accessSecret) {
            return accessSecret(Output.of(accessSecret));
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param indepAccount Database account.
         * 
         * @return builder
         * 
         */
        public Builder indepAccount(@Nullable Output<String> indepAccount) {
            $.indepAccount = indepAccount;
            return this;
        }

        /**
         * @param indepAccount Database account.
         * 
         * @return builder
         * 
         */
        public Builder indepAccount(String indepAccount) {
            return indepAccount(Output.of(indepAccount));
        }

        /**
         * @param indepPassword Database password.
         * 
         * @return builder
         * 
         */
        public Builder indepPassword(@Nullable Output<String> indepPassword) {
            $.indepPassword = indepPassword;
            return this;
        }

        /**
         * @param indepPassword Database password.
         * 
         * @return builder
         * 
         */
        public Builder indepPassword(String indepPassword) {
            return indepPassword(Output.of(indepPassword));
        }

        /**
         * @param instanceId The ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param originInfo The source information of the security access agent permission is enabled, and the return value is as follows:
         * * **Owner Authorization**: The UID of the owner in parentheses.
         * * **Work Order Authorization**: The ticket number in parentheses is the number of the user to apply for permission.
         * 
         * @return builder
         * 
         */
        public Builder originInfo(@Nullable Output<String> originInfo) {
            $.originInfo = originInfo;
            return this;
        }

        /**
         * @param originInfo The source information of the security access agent permission is enabled, and the return value is as follows:
         * * **Owner Authorization**: The UID of the owner in parentheses.
         * * **Work Order Authorization**: The ticket number in parentheses is the number of the user to apply for permission.
         * 
         * @return builder
         * 
         */
        public Builder originInfo(String originInfo) {
            return originInfo(Output.of(originInfo));
        }

        /**
         * @param proxyAccessId Security Protection authorization ID. After the target user is authorized by the security protection agent, the system automatically generates a security protection authorization ID, which is globally unique.
         * 
         * @return builder
         * 
         */
        public Builder proxyAccessId(@Nullable Output<String> proxyAccessId) {
            $.proxyAccessId = proxyAccessId;
            return this;
        }

        /**
         * @param proxyAccessId Security Protection authorization ID. After the target user is authorized by the security protection agent, the system automatically generates a security protection authorization ID, which is globally unique.
         * 
         * @return builder
         * 
         */
        public Builder proxyAccessId(String proxyAccessId) {
            return proxyAccessId(Output.of(proxyAccessId));
        }

        /**
         * @param proxyId The ID of the security agent.
         * 
         * @return builder
         * 
         */
        public Builder proxyId(@Nullable Output<String> proxyId) {
            $.proxyId = proxyId;
            return this;
        }

        /**
         * @param proxyId The ID of the security agent.
         * 
         * @return builder
         * 
         */
        public Builder proxyId(String proxyId) {
            return proxyId(Output.of(proxyId));
        }

        /**
         * @param userId The user ID.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The user ID.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        /**
         * @param userName User nickname.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName User nickname.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        /**
         * @param userUid User UID.
         * 
         * @return builder
         * 
         */
        public Builder userUid(@Nullable Output<String> userUid) {
            $.userUid = userUid;
            return this;
        }

        /**
         * @param userUid User UID.
         * 
         * @return builder
         * 
         */
        public Builder userUid(String userUid) {
            return userUid(Output.of(userUid));
        }

        public EnterpriseProxyAccessState build() {
            return $;
        }
    }

}