// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.alicloud.cms.outputs.GetGroupMetricRulesRuleEscalationCritical;
import com.pulumi.alicloud.cms.outputs.GetGroupMetricRulesRuleEscalationInfo;
import com.pulumi.alicloud.cms.outputs.GetGroupMetricRulesRuleEscalationWarn;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGroupMetricRulesRuleEscalation {
    /**
     * @return The critical level.
     * 
     */
    private List<GetGroupMetricRulesRuleEscalationCritical> criticals;
    /**
     * @return The info level.
     * 
     */
    private List<GetGroupMetricRulesRuleEscalationInfo> infos;
    /**
     * @return The warn level.
     * 
     */
    private List<GetGroupMetricRulesRuleEscalationWarn> warns;

    private GetGroupMetricRulesRuleEscalation() {}
    /**
     * @return The critical level.
     * 
     */
    public List<GetGroupMetricRulesRuleEscalationCritical> criticals() {
        return this.criticals;
    }
    /**
     * @return The info level.
     * 
     */
    public List<GetGroupMetricRulesRuleEscalationInfo> infos() {
        return this.infos;
    }
    /**
     * @return The warn level.
     * 
     */
    public List<GetGroupMetricRulesRuleEscalationWarn> warns() {
        return this.warns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupMetricRulesRuleEscalation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetGroupMetricRulesRuleEscalationCritical> criticals;
        private List<GetGroupMetricRulesRuleEscalationInfo> infos;
        private List<GetGroupMetricRulesRuleEscalationWarn> warns;
        public Builder() {}
        public Builder(GetGroupMetricRulesRuleEscalation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criticals = defaults.criticals;
    	      this.infos = defaults.infos;
    	      this.warns = defaults.warns;
        }

        @CustomType.Setter
        public Builder criticals(List<GetGroupMetricRulesRuleEscalationCritical> criticals) {
            if (criticals == null) {
              throw new MissingRequiredPropertyException("GetGroupMetricRulesRuleEscalation", "criticals");
            }
            this.criticals = criticals;
            return this;
        }
        public Builder criticals(GetGroupMetricRulesRuleEscalationCritical... criticals) {
            return criticals(List.of(criticals));
        }
        @CustomType.Setter
        public Builder infos(List<GetGroupMetricRulesRuleEscalationInfo> infos) {
            if (infos == null) {
              throw new MissingRequiredPropertyException("GetGroupMetricRulesRuleEscalation", "infos");
            }
            this.infos = infos;
            return this;
        }
        public Builder infos(GetGroupMetricRulesRuleEscalationInfo... infos) {
            return infos(List.of(infos));
        }
        @CustomType.Setter
        public Builder warns(List<GetGroupMetricRulesRuleEscalationWarn> warns) {
            if (warns == null) {
              throw new MissingRequiredPropertyException("GetGroupMetricRulesRuleEscalation", "warns");
            }
            this.warns = warns;
            return this;
        }
        public Builder warns(GetGroupMetricRulesRuleEscalationWarn... warns) {
            return warns(List.of(warns));
        }
        public GetGroupMetricRulesRuleEscalation build() {
            final var _resultValue = new GetGroupMetricRulesRuleEscalation();
            _resultValue.criticals = criticals;
            _resultValue.infos = infos;
            _resultValue.warns = warns;
            return _resultValue;
        }
    }
}