// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class DispatchRuleNotifyTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final DispatchRuleNotifyTemplateArgs Empty = new DispatchRuleNotifyTemplateArgs();

    /**
     * The content of the email notification.
     * 
     */
    @Import(name="emailContent", required=true)
    private Output<String> emailContent;

    /**
     * @return The content of the email notification.
     * 
     */
    public Output<String> emailContent() {
        return this.emailContent;
    }

    /**
     * The content of the email notification for restored alerts.
     * 
     */
    @Import(name="emailRecoverContent", required=true)
    private Output<String> emailRecoverContent;

    /**
     * @return The content of the email notification for restored alerts.
     * 
     */
    public Output<String> emailRecoverContent() {
        return this.emailRecoverContent;
    }

    /**
     * The title of the email notification for restored alerts.
     * 
     */
    @Import(name="emailRecoverTitle", required=true)
    private Output<String> emailRecoverTitle;

    /**
     * @return The title of the email notification for restored alerts.
     * 
     */
    public Output<String> emailRecoverTitle() {
        return this.emailRecoverTitle;
    }

    /**
     * The title of the email notification.
     * 
     */
    @Import(name="emailTitle", required=true)
    private Output<String> emailTitle;

    /**
     * @return The title of the email notification.
     * 
     */
    public Output<String> emailTitle() {
        return this.emailTitle;
    }

    /**
     * The content of the robot notification.
     * 
     */
    @Import(name="robotContent", required=true)
    private Output<String> robotContent;

    /**
     * @return The content of the robot notification.
     * 
     */
    public Output<String> robotContent() {
        return this.robotContent;
    }

    /**
     * The content of the SMS notification.
     * 
     */
    @Import(name="smsContent", required=true)
    private Output<String> smsContent;

    /**
     * @return The content of the SMS notification.
     * 
     */
    public Output<String> smsContent() {
        return this.smsContent;
    }

    /**
     * The content of the SMS notification for restored alerts.
     * 
     */
    @Import(name="smsRecoverContent", required=true)
    private Output<String> smsRecoverContent;

    /**
     * @return The content of the SMS notification for restored alerts.
     * 
     */
    public Output<String> smsRecoverContent() {
        return this.smsRecoverContent;
    }

    /**
     * The content of the TTS notification.
     * 
     */
    @Import(name="ttsContent", required=true)
    private Output<String> ttsContent;

    /**
     * @return The content of the TTS notification.
     * 
     */
    public Output<String> ttsContent() {
        return this.ttsContent;
    }

    /**
     * The content of the TTS notification for restored alerts.
     * 
     */
    @Import(name="ttsRecoverContent", required=true)
    private Output<String> ttsRecoverContent;

    /**
     * @return The content of the TTS notification for restored alerts.
     * 
     */
    public Output<String> ttsRecoverContent() {
        return this.ttsRecoverContent;
    }

    private DispatchRuleNotifyTemplateArgs() {}

    private DispatchRuleNotifyTemplateArgs(DispatchRuleNotifyTemplateArgs $) {
        this.emailContent = $.emailContent;
        this.emailRecoverContent = $.emailRecoverContent;
        this.emailRecoverTitle = $.emailRecoverTitle;
        this.emailTitle = $.emailTitle;
        this.robotContent = $.robotContent;
        this.smsContent = $.smsContent;
        this.smsRecoverContent = $.smsRecoverContent;
        this.ttsContent = $.ttsContent;
        this.ttsRecoverContent = $.ttsRecoverContent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DispatchRuleNotifyTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DispatchRuleNotifyTemplateArgs $;

        public Builder() {
            $ = new DispatchRuleNotifyTemplateArgs();
        }

        public Builder(DispatchRuleNotifyTemplateArgs defaults) {
            $ = new DispatchRuleNotifyTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param emailContent The content of the email notification.
         * 
         * @return builder
         * 
         */
        public Builder emailContent(Output<String> emailContent) {
            $.emailContent = emailContent;
            return this;
        }

        /**
         * @param emailContent The content of the email notification.
         * 
         * @return builder
         * 
         */
        public Builder emailContent(String emailContent) {
            return emailContent(Output.of(emailContent));
        }

        /**
         * @param emailRecoverContent The content of the email notification for restored alerts.
         * 
         * @return builder
         * 
         */
        public Builder emailRecoverContent(Output<String> emailRecoverContent) {
            $.emailRecoverContent = emailRecoverContent;
            return this;
        }

        /**
         * @param emailRecoverContent The content of the email notification for restored alerts.
         * 
         * @return builder
         * 
         */
        public Builder emailRecoverContent(String emailRecoverContent) {
            return emailRecoverContent(Output.of(emailRecoverContent));
        }

        /**
         * @param emailRecoverTitle The title of the email notification for restored alerts.
         * 
         * @return builder
         * 
         */
        public Builder emailRecoverTitle(Output<String> emailRecoverTitle) {
            $.emailRecoverTitle = emailRecoverTitle;
            return this;
        }

        /**
         * @param emailRecoverTitle The title of the email notification for restored alerts.
         * 
         * @return builder
         * 
         */
        public Builder emailRecoverTitle(String emailRecoverTitle) {
            return emailRecoverTitle(Output.of(emailRecoverTitle));
        }

        /**
         * @param emailTitle The title of the email notification.
         * 
         * @return builder
         * 
         */
        public Builder emailTitle(Output<String> emailTitle) {
            $.emailTitle = emailTitle;
            return this;
        }

        /**
         * @param emailTitle The title of the email notification.
         * 
         * @return builder
         * 
         */
        public Builder emailTitle(String emailTitle) {
            return emailTitle(Output.of(emailTitle));
        }

        /**
         * @param robotContent The content of the robot notification.
         * 
         * @return builder
         * 
         */
        public Builder robotContent(Output<String> robotContent) {
            $.robotContent = robotContent;
            return this;
        }

        /**
         * @param robotContent The content of the robot notification.
         * 
         * @return builder
         * 
         */
        public Builder robotContent(String robotContent) {
            return robotContent(Output.of(robotContent));
        }

        /**
         * @param smsContent The content of the SMS notification.
         * 
         * @return builder
         * 
         */
        public Builder smsContent(Output<String> smsContent) {
            $.smsContent = smsContent;
            return this;
        }

        /**
         * @param smsContent The content of the SMS notification.
         * 
         * @return builder
         * 
         */
        public Builder smsContent(String smsContent) {
            return smsContent(Output.of(smsContent));
        }

        /**
         * @param smsRecoverContent The content of the SMS notification for restored alerts.
         * 
         * @return builder
         * 
         */
        public Builder smsRecoverContent(Output<String> smsRecoverContent) {
            $.smsRecoverContent = smsRecoverContent;
            return this;
        }

        /**
         * @param smsRecoverContent The content of the SMS notification for restored alerts.
         * 
         * @return builder
         * 
         */
        public Builder smsRecoverContent(String smsRecoverContent) {
            return smsRecoverContent(Output.of(smsRecoverContent));
        }

        /**
         * @param ttsContent The content of the TTS notification.
         * 
         * @return builder
         * 
         */
        public Builder ttsContent(Output<String> ttsContent) {
            $.ttsContent = ttsContent;
            return this;
        }

        /**
         * @param ttsContent The content of the TTS notification.
         * 
         * @return builder
         * 
         */
        public Builder ttsContent(String ttsContent) {
            return ttsContent(Output.of(ttsContent));
        }

        /**
         * @param ttsRecoverContent The content of the TTS notification for restored alerts.
         * 
         * @return builder
         * 
         */
        public Builder ttsRecoverContent(Output<String> ttsRecoverContent) {
            $.ttsRecoverContent = ttsRecoverContent;
            return this;
        }

        /**
         * @param ttsRecoverContent The content of the TTS notification for restored alerts.
         * 
         * @return builder
         * 
         */
        public Builder ttsRecoverContent(String ttsRecoverContent) {
            return ttsRecoverContent(Output.of(ttsRecoverContent));
        }

        public DispatchRuleNotifyTemplateArgs build() {
            if ($.emailContent == null) {
                throw new MissingRequiredPropertyException("DispatchRuleNotifyTemplateArgs", "emailContent");
            }
            if ($.emailRecoverContent == null) {
                throw new MissingRequiredPropertyException("DispatchRuleNotifyTemplateArgs", "emailRecoverContent");
            }
            if ($.emailRecoverTitle == null) {
                throw new MissingRequiredPropertyException("DispatchRuleNotifyTemplateArgs", "emailRecoverTitle");
            }
            if ($.emailTitle == null) {
                throw new MissingRequiredPropertyException("DispatchRuleNotifyTemplateArgs", "emailTitle");
            }
            if ($.robotContent == null) {
                throw new MissingRequiredPropertyException("DispatchRuleNotifyTemplateArgs", "robotContent");
            }
            if ($.smsContent == null) {
                throw new MissingRequiredPropertyException("DispatchRuleNotifyTemplateArgs", "smsContent");
            }
            if ($.smsRecoverContent == null) {
                throw new MissingRequiredPropertyException("DispatchRuleNotifyTemplateArgs", "smsRecoverContent");
            }
            if ($.ttsContent == null) {
                throw new MissingRequiredPropertyException("DispatchRuleNotifyTemplateArgs", "ttsContent");
            }
            if ($.ttsRecoverContent == null) {
                throw new MissingRequiredPropertyException("DispatchRuleNotifyTemplateArgs", "ttsRecoverContent");
            }
            return $;
        }
    }

}
