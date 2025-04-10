// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.schedulerx.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobJobMonitorInfoContactInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobJobMonitorInfoContactInfoArgs Empty = new JobJobMonitorInfoContactInfoArgs();

    /**
     * DingTalk swarm robot webhook address
     * 
     */
    @Import(name="ding")
    private @Nullable Output<String> ding;

    /**
     * @return DingTalk swarm robot webhook address
     * 
     */
    public Optional<Output<String>> ding() {
        return Optional.ofNullable(this.ding);
    }

    /**
     * User Email Address
     * 
     */
    @Import(name="userMail")
    private @Nullable Output<String> userMail;

    /**
     * @return User Email Address
     * 
     */
    public Optional<Output<String>> userMail() {
        return Optional.ofNullable(this.userMail);
    }

    /**
     * The user name
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return The user name
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    /**
     * The user&#39;s mobile phone number
     * 
     */
    @Import(name="userPhone")
    private @Nullable Output<String> userPhone;

    /**
     * @return The user&#39;s mobile phone number
     * 
     */
    public Optional<Output<String>> userPhone() {
        return Optional.ofNullable(this.userPhone);
    }

    private JobJobMonitorInfoContactInfoArgs() {}

    private JobJobMonitorInfoContactInfoArgs(JobJobMonitorInfoContactInfoArgs $) {
        this.ding = $.ding;
        this.userMail = $.userMail;
        this.userName = $.userName;
        this.userPhone = $.userPhone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobJobMonitorInfoContactInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobJobMonitorInfoContactInfoArgs $;

        public Builder() {
            $ = new JobJobMonitorInfoContactInfoArgs();
        }

        public Builder(JobJobMonitorInfoContactInfoArgs defaults) {
            $ = new JobJobMonitorInfoContactInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ding DingTalk swarm robot webhook address
         * 
         * @return builder
         * 
         */
        public Builder ding(@Nullable Output<String> ding) {
            $.ding = ding;
            return this;
        }

        /**
         * @param ding DingTalk swarm robot webhook address
         * 
         * @return builder
         * 
         */
        public Builder ding(String ding) {
            return ding(Output.of(ding));
        }

        /**
         * @param userMail User Email Address
         * 
         * @return builder
         * 
         */
        public Builder userMail(@Nullable Output<String> userMail) {
            $.userMail = userMail;
            return this;
        }

        /**
         * @param userMail User Email Address
         * 
         * @return builder
         * 
         */
        public Builder userMail(String userMail) {
            return userMail(Output.of(userMail));
        }

        /**
         * @param userName The user name
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The user name
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        /**
         * @param userPhone The user&#39;s mobile phone number
         * 
         * @return builder
         * 
         */
        public Builder userPhone(@Nullable Output<String> userPhone) {
            $.userPhone = userPhone;
            return this;
        }

        /**
         * @param userPhone The user&#39;s mobile phone number
         * 
         * @return builder
         * 
         */
        public Builder userPhone(String userPhone) {
            return userPhone(Output.of(userPhone));
        }

        public JobJobMonitorInfoContactInfoArgs build() {
            return $;
        }
    }

}
