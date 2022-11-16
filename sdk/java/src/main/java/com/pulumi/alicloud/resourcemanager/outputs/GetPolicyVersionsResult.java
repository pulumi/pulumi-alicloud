// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.outputs;

import com.pulumi.alicloud.resourcemanager.outputs.GetPolicyVersionsVersion;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPolicyVersionsResult {
    private final @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of policy version IDs.
     * 
     */
    private final List<String> ids;
    private final @Nullable String outputFile;
    private final String policyName;
    private final String policyType;
    /**
     * @return A list of policy versions. Each element contains the following attributes:
     * 
     */
    private final List<GetPolicyVersionsVersion> versions;

    @CustomType.Constructor
    private GetPolicyVersionsResult(
        @CustomType.Parameter("enableDetails") @Nullable Boolean enableDetails,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("policyName") String policyName,
        @CustomType.Parameter("policyType") String policyType,
        @CustomType.Parameter("versions") List<GetPolicyVersionsVersion> versions) {
        this.enableDetails = enableDetails;
        this.id = id;
        this.ids = ids;
        this.outputFile = outputFile;
        this.policyName = policyName;
        this.policyType = policyType;
        this.versions = versions;
    }

    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of policy version IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public String policyName() {
        return this.policyName;
    }
    public String policyType() {
        return this.policyType;
    }
    /**
     * @return A list of policy versions. Each element contains the following attributes:
     * 
     */
    public List<GetPolicyVersionsVersion> versions() {
        return this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyVersionsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private String policyName;
        private String policyType;
        private List<GetPolicyVersionsVersion> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyVersionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.policyName = defaults.policyName;
    	      this.policyType = defaults.policyType;
    	      this.versions = defaults.versions;
        }

        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
            return this;
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
        public Builder policyName(String policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }
        public Builder policyType(String policyType) {
            this.policyType = Objects.requireNonNull(policyType);
            return this;
        }
        public Builder versions(List<GetPolicyVersionsVersion> versions) {
            this.versions = Objects.requireNonNull(versions);
            return this;
        }
        public Builder versions(GetPolicyVersionsVersion... versions) {
            return versions(List.of(versions));
        }        public GetPolicyVersionsResult build() {
            return new GetPolicyVersionsResult(enableDetails, id, ids, outputFile, policyName, policyType, versions);
        }
    }
}