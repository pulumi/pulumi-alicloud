// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetTrafficMirrorFilterEgressRulesRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTrafficMirrorFilterEgressRulesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String outputFile;
    private final List<GetTrafficMirrorFilterEgressRulesRule> rules;
    private final @Nullable String status;
    private final String trafficMirrorFilterId;

    @CustomType.Constructor
    private GetTrafficMirrorFilterEgressRulesResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("rules") List<GetTrafficMirrorFilterEgressRulesRule> rules,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("trafficMirrorFilterId") String trafficMirrorFilterId) {
        this.id = id;
        this.ids = ids;
        this.outputFile = outputFile;
        this.rules = rules;
        this.status = status;
        this.trafficMirrorFilterId = trafficMirrorFilterId;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public List<GetTrafficMirrorFilterEgressRulesRule> rules() {
        return this.rules;
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public String trafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrafficMirrorFilterEgressRulesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private List<GetTrafficMirrorFilterEgressRulesRule> rules;
        private @Nullable String status;
        private String trafficMirrorFilterId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTrafficMirrorFilterEgressRulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.rules = defaults.rules;
    	      this.status = defaults.status;
    	      this.trafficMirrorFilterId = defaults.trafficMirrorFilterId;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder rules(List<GetTrafficMirrorFilterEgressRulesRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetTrafficMirrorFilterEgressRulesRule... rules) {
            return rules(List.of(rules));
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
            this.trafficMirrorFilterId = Objects.requireNonNull(trafficMirrorFilterId);
            return this;
        }        public GetTrafficMirrorFilterEgressRulesResult build() {
            return new GetTrafficMirrorFilterEgressRulesResult(id, ids, outputFile, rules, status, trafficMirrorFilterId);
        }
    }
}