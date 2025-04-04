// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AntiBruteForceRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AntiBruteForceRuleArgs Empty = new AntiBruteForceRuleArgs();

    /**
     * The name of the defense rule.
     * 
     */
    @Import(name="antiBruteForceRuleName", required=true)
    private Output<String> antiBruteForceRuleName;

    /**
     * @return The name of the defense rule.
     * 
     */
    public Output<String> antiBruteForceRuleName() {
        return this.antiBruteForceRuleName;
    }

    /**
     * Specifies whether to set the defense rule as the default rule.
     * 
     */
    @Import(name="defaultRule")
    private @Nullable Output<Boolean> defaultRule;

    /**
     * @return Specifies whether to set the defense rule as the default rule.
     * 
     */
    public Optional<Output<Boolean>> defaultRule() {
        return Optional.ofNullable(this.defaultRule);
    }

    /**
     * The threshold for the number of failed user logins when the brute-force defense rule takes effect.
     * 
     */
    @Import(name="failCount", required=true)
    private Output<Integer> failCount;

    /**
     * @return The threshold for the number of failed user logins when the brute-force defense rule takes effect.
     * 
     */
    public Output<Integer> failCount() {
        return this.failCount;
    }

    /**
     * The period of time during which logons from an account are not allowed. Unit: minutes.
     * 
     */
    @Import(name="forbiddenTime", required=true)
    private Output<Integer> forbiddenTime;

    /**
     * @return The period of time during which logons from an account are not allowed. Unit: minutes.
     * 
     */
    public Output<Integer> forbiddenTime() {
        return this.forbiddenTime;
    }

    /**
     * The period of time during which logon failures from an account are measured. Unit: minutes. If Span is set to 10, the defense rule takes effect when the logon failures measured within 10 minutes reaches the specified threshold. The IP address of attackers cannot be used to log on to the server in the specified period of time.
     * 
     */
    @Import(name="span", required=true)
    private Output<Integer> span;

    /**
     * @return The period of time during which logon failures from an account are measured. Unit: minutes. If Span is set to 10, the defense rule takes effect when the logon failures measured within 10 minutes reaches the specified threshold. The IP address of attackers cannot be used to log on to the server in the specified period of time.
     * 
     */
    public Output<Integer> span() {
        return this.span;
    }

    /**
     * An array consisting of the UUIDs of servers to which the defense rule is applied.**The binding status must be Enterprise Edition.**
     * 
     */
    @Import(name="uuidLists", required=true)
    private Output<List<String>> uuidLists;

    /**
     * @return An array consisting of the UUIDs of servers to which the defense rule is applied.**The binding status must be Enterprise Edition.**
     * 
     */
    public Output<List<String>> uuidLists() {
        return this.uuidLists;
    }

    private AntiBruteForceRuleArgs() {}

    private AntiBruteForceRuleArgs(AntiBruteForceRuleArgs $) {
        this.antiBruteForceRuleName = $.antiBruteForceRuleName;
        this.defaultRule = $.defaultRule;
        this.failCount = $.failCount;
        this.forbiddenTime = $.forbiddenTime;
        this.span = $.span;
        this.uuidLists = $.uuidLists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AntiBruteForceRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AntiBruteForceRuleArgs $;

        public Builder() {
            $ = new AntiBruteForceRuleArgs();
        }

        public Builder(AntiBruteForceRuleArgs defaults) {
            $ = new AntiBruteForceRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param antiBruteForceRuleName The name of the defense rule.
         * 
         * @return builder
         * 
         */
        public Builder antiBruteForceRuleName(Output<String> antiBruteForceRuleName) {
            $.antiBruteForceRuleName = antiBruteForceRuleName;
            return this;
        }

        /**
         * @param antiBruteForceRuleName The name of the defense rule.
         * 
         * @return builder
         * 
         */
        public Builder antiBruteForceRuleName(String antiBruteForceRuleName) {
            return antiBruteForceRuleName(Output.of(antiBruteForceRuleName));
        }

        /**
         * @param defaultRule Specifies whether to set the defense rule as the default rule.
         * 
         * @return builder
         * 
         */
        public Builder defaultRule(@Nullable Output<Boolean> defaultRule) {
            $.defaultRule = defaultRule;
            return this;
        }

        /**
         * @param defaultRule Specifies whether to set the defense rule as the default rule.
         * 
         * @return builder
         * 
         */
        public Builder defaultRule(Boolean defaultRule) {
            return defaultRule(Output.of(defaultRule));
        }

        /**
         * @param failCount The threshold for the number of failed user logins when the brute-force defense rule takes effect.
         * 
         * @return builder
         * 
         */
        public Builder failCount(Output<Integer> failCount) {
            $.failCount = failCount;
            return this;
        }

        /**
         * @param failCount The threshold for the number of failed user logins when the brute-force defense rule takes effect.
         * 
         * @return builder
         * 
         */
        public Builder failCount(Integer failCount) {
            return failCount(Output.of(failCount));
        }

        /**
         * @param forbiddenTime The period of time during which logons from an account are not allowed. Unit: minutes.
         * 
         * @return builder
         * 
         */
        public Builder forbiddenTime(Output<Integer> forbiddenTime) {
            $.forbiddenTime = forbiddenTime;
            return this;
        }

        /**
         * @param forbiddenTime The period of time during which logons from an account are not allowed. Unit: minutes.
         * 
         * @return builder
         * 
         */
        public Builder forbiddenTime(Integer forbiddenTime) {
            return forbiddenTime(Output.of(forbiddenTime));
        }

        /**
         * @param span The period of time during which logon failures from an account are measured. Unit: minutes. If Span is set to 10, the defense rule takes effect when the logon failures measured within 10 minutes reaches the specified threshold. The IP address of attackers cannot be used to log on to the server in the specified period of time.
         * 
         * @return builder
         * 
         */
        public Builder span(Output<Integer> span) {
            $.span = span;
            return this;
        }

        /**
         * @param span The period of time during which logon failures from an account are measured. Unit: minutes. If Span is set to 10, the defense rule takes effect when the logon failures measured within 10 minutes reaches the specified threshold. The IP address of attackers cannot be used to log on to the server in the specified period of time.
         * 
         * @return builder
         * 
         */
        public Builder span(Integer span) {
            return span(Output.of(span));
        }

        /**
         * @param uuidLists An array consisting of the UUIDs of servers to which the defense rule is applied.**The binding status must be Enterprise Edition.**
         * 
         * @return builder
         * 
         */
        public Builder uuidLists(Output<List<String>> uuidLists) {
            $.uuidLists = uuidLists;
            return this;
        }

        /**
         * @param uuidLists An array consisting of the UUIDs of servers to which the defense rule is applied.**The binding status must be Enterprise Edition.**
         * 
         * @return builder
         * 
         */
        public Builder uuidLists(List<String> uuidLists) {
            return uuidLists(Output.of(uuidLists));
        }

        /**
         * @param uuidLists An array consisting of the UUIDs of servers to which the defense rule is applied.**The binding status must be Enterprise Edition.**
         * 
         * @return builder
         * 
         */
        public Builder uuidLists(String... uuidLists) {
            return uuidLists(List.of(uuidLists));
        }

        public AntiBruteForceRuleArgs build() {
            if ($.antiBruteForceRuleName == null) {
                throw new MissingRequiredPropertyException("AntiBruteForceRuleArgs", "antiBruteForceRuleName");
            }
            if ($.failCount == null) {
                throw new MissingRequiredPropertyException("AntiBruteForceRuleArgs", "failCount");
            }
            if ($.forbiddenTime == null) {
                throw new MissingRequiredPropertyException("AntiBruteForceRuleArgs", "forbiddenTime");
            }
            if ($.span == null) {
                throw new MissingRequiredPropertyException("AntiBruteForceRuleArgs", "span");
            }
            if ($.uuidLists == null) {
                throw new MissingRequiredPropertyException("AntiBruteForceRuleArgs", "uuidLists");
            }
            return $;
        }
    }

}
