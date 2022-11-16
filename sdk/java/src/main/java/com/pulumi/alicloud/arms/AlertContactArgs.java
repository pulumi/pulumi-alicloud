// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertContactArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertContactArgs Empty = new AlertContactArgs();

    /**
     * The name of the alert contact.
     * 
     */
    @Import(name="alertContactName")
    private @Nullable Output<String> alertContactName;

    /**
     * @return The name of the alert contact.
     * 
     */
    public Optional<Output<String>> alertContactName() {
        return Optional.ofNullable(this.alertContactName);
    }

    /**
     * The webhook URL of the DingTalk chatbot. For more information about how to obtain the URL, see Configure a DingTalk chatbot to send alert notifications: https://www.alibabacloud.com/help/en/doc-detail/106247.htm. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
     * 
     */
    @Import(name="dingRobotWebhookUrl")
    private @Nullable Output<String> dingRobotWebhookUrl;

    /**
     * @return The webhook URL of the DingTalk chatbot. For more information about how to obtain the URL, see Configure a DingTalk chatbot to send alert notifications: https://www.alibabacloud.com/help/en/doc-detail/106247.htm. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
     * 
     */
    public Optional<Output<String>> dingRobotWebhookUrl() {
        return Optional.ofNullable(this.dingRobotWebhookUrl);
    }

    /**
     * The email address of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return The email address of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * The mobile number of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
     * 
     */
    @Import(name="phoneNum")
    private @Nullable Output<String> phoneNum;

    /**
     * @return The mobile number of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
     * 
     */
    public Optional<Output<String>> phoneNum() {
        return Optional.ofNullable(this.phoneNum);
    }

    /**
     * Specifies whether the alert contact receives system notifications. Valid values:  true: receives system notifications. false: does not receive system notifications.
     * 
     */
    @Import(name="systemNoc")
    private @Nullable Output<Boolean> systemNoc;

    /**
     * @return Specifies whether the alert contact receives system notifications. Valid values:  true: receives system notifications. false: does not receive system notifications.
     * 
     */
    public Optional<Output<Boolean>> systemNoc() {
        return Optional.ofNullable(this.systemNoc);
    }

    private AlertContactArgs() {}

    private AlertContactArgs(AlertContactArgs $) {
        this.alertContactName = $.alertContactName;
        this.dingRobotWebhookUrl = $.dingRobotWebhookUrl;
        this.email = $.email;
        this.phoneNum = $.phoneNum;
        this.systemNoc = $.systemNoc;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertContactArgs $;

        public Builder() {
            $ = new AlertContactArgs();
        }

        public Builder(AlertContactArgs defaults) {
            $ = new AlertContactArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertContactName The name of the alert contact.
         * 
         * @return builder
         * 
         */
        public Builder alertContactName(@Nullable Output<String> alertContactName) {
            $.alertContactName = alertContactName;
            return this;
        }

        /**
         * @param alertContactName The name of the alert contact.
         * 
         * @return builder
         * 
         */
        public Builder alertContactName(String alertContactName) {
            return alertContactName(Output.of(alertContactName));
        }

        /**
         * @param dingRobotWebhookUrl The webhook URL of the DingTalk chatbot. For more information about how to obtain the URL, see Configure a DingTalk chatbot to send alert notifications: https://www.alibabacloud.com/help/en/doc-detail/106247.htm. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
         * 
         * @return builder
         * 
         */
        public Builder dingRobotWebhookUrl(@Nullable Output<String> dingRobotWebhookUrl) {
            $.dingRobotWebhookUrl = dingRobotWebhookUrl;
            return this;
        }

        /**
         * @param dingRobotWebhookUrl The webhook URL of the DingTalk chatbot. For more information about how to obtain the URL, see Configure a DingTalk chatbot to send alert notifications: https://www.alibabacloud.com/help/en/doc-detail/106247.htm. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
         * 
         * @return builder
         * 
         */
        public Builder dingRobotWebhookUrl(String dingRobotWebhookUrl) {
            return dingRobotWebhookUrl(Output.of(dingRobotWebhookUrl));
        }

        /**
         * @param email The email address of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email address of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param phoneNum The mobile number of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
         * 
         * @return builder
         * 
         */
        public Builder phoneNum(@Nullable Output<String> phoneNum) {
            $.phoneNum = phoneNum;
            return this;
        }

        /**
         * @param phoneNum The mobile number of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
         * 
         * @return builder
         * 
         */
        public Builder phoneNum(String phoneNum) {
            return phoneNum(Output.of(phoneNum));
        }

        /**
         * @param systemNoc Specifies whether the alert contact receives system notifications. Valid values:  true: receives system notifications. false: does not receive system notifications.
         * 
         * @return builder
         * 
         */
        public Builder systemNoc(@Nullable Output<Boolean> systemNoc) {
            $.systemNoc = systemNoc;
            return this;
        }

        /**
         * @param systemNoc Specifies whether the alert contact receives system notifications. Valid values:  true: receives system notifications. false: does not receive system notifications.
         * 
         * @return builder
         * 
         */
        public Builder systemNoc(Boolean systemNoc) {
            return systemNoc(Output.of(systemNoc));
        }

        public AlertContactArgs build() {
            return $;
        }
    }

}