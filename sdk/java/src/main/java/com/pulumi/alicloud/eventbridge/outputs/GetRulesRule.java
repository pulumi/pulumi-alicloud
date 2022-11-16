// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eventbridge.outputs;

import com.pulumi.alicloud.eventbridge.outputs.GetRulesRuleTarget;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRulesRule {
    /**
     * @return The description of rule.
     * 
     */
    private final String description;
    /**
     * @return The name of event bus.
     * 
     */
    private final String eventBusName;
    /**
     * @return The pattern to match interested events.
     * 
     */
    private final String filterPattern;
    /**
     * @return The ID of the Rule.
     * 
     */
    private final String id;
    /**
     * @return The name of rule.
     * 
     */
    private final String ruleName;
    /**
     * @return Rule status, either Enable or Disable.
     * 
     */
    private final String status;
    /**
     * @return The target for rule.
     * 
     */
    private final List<GetRulesRuleTarget> targets;

    @CustomType.Constructor
    private GetRulesRule(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("eventBusName") String eventBusName,
        @CustomType.Parameter("filterPattern") String filterPattern,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ruleName") String ruleName,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("targets") List<GetRulesRuleTarget> targets) {
        this.description = description;
        this.eventBusName = eventBusName;
        this.filterPattern = filterPattern;
        this.id = id;
        this.ruleName = ruleName;
        this.status = status;
        this.targets = targets;
    }

    /**
     * @return The description of rule.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The name of event bus.
     * 
     */
    public String eventBusName() {
        return this.eventBusName;
    }
    /**
     * @return The pattern to match interested events.
     * 
     */
    public String filterPattern() {
        return this.filterPattern;
    }
    /**
     * @return The ID of the Rule.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of rule.
     * 
     */
    public String ruleName() {
        return this.ruleName;
    }
    /**
     * @return Rule status, either Enable or Disable.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The target for rule.
     * 
     */
    public List<GetRulesRuleTarget> targets() {
        return this.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String eventBusName;
        private String filterPattern;
        private String id;
        private String ruleName;
        private String status;
        private List<GetRulesRuleTarget> targets;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRulesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.eventBusName = defaults.eventBusName;
    	      this.filterPattern = defaults.filterPattern;
    	      this.id = defaults.id;
    	      this.ruleName = defaults.ruleName;
    	      this.status = defaults.status;
    	      this.targets = defaults.targets;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder eventBusName(String eventBusName) {
            this.eventBusName = Objects.requireNonNull(eventBusName);
            return this;
        }
        public Builder filterPattern(String filterPattern) {
            this.filterPattern = Objects.requireNonNull(filterPattern);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ruleName(String ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder targets(List<GetRulesRuleTarget> targets) {
            this.targets = Objects.requireNonNull(targets);
            return this;
        }
        public Builder targets(GetRulesRuleTarget... targets) {
            return targets(List.of(targets));
        }        public GetRulesRule build() {
            return new GetRulesRule(description, eventBusName, filterPattern, id, ruleName, status, targets);
        }
    }
}