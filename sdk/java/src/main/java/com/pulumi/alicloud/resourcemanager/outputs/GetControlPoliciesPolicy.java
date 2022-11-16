// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetControlPoliciesPolicy {
    /**
     * @return The count of policy attachment.
     * 
     */
    private final Integer attachmentCount;
    /**
     * @return The name of policy.
     * 
     */
    private final String controlPolicyName;
    /**
     * @return The description of policy.
     * 
     */
    private final String description;
    /**
     * @return The effect scope.
     * 
     */
    private final String effectScope;
    /**
     * @return The ID of the Control Policy.
     * 
     */
    private final String id;
    /**
     * @return The policy document.
     * 
     */
    private final String policyDocument;
    /**
     * @return The ID of policy.
     * 
     */
    private final String policyId;
    /**
     * @return The type of policy.
     * 
     */
    private final String policyType;

    @CustomType.Constructor
    private GetControlPoliciesPolicy(
        @CustomType.Parameter("attachmentCount") Integer attachmentCount,
        @CustomType.Parameter("controlPolicyName") String controlPolicyName,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("effectScope") String effectScope,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("policyDocument") String policyDocument,
        @CustomType.Parameter("policyId") String policyId,
        @CustomType.Parameter("policyType") String policyType) {
        this.attachmentCount = attachmentCount;
        this.controlPolicyName = controlPolicyName;
        this.description = description;
        this.effectScope = effectScope;
        this.id = id;
        this.policyDocument = policyDocument;
        this.policyId = policyId;
        this.policyType = policyType;
    }

    /**
     * @return The count of policy attachment.
     * 
     */
    public Integer attachmentCount() {
        return this.attachmentCount;
    }
    /**
     * @return The name of policy.
     * 
     */
    public String controlPolicyName() {
        return this.controlPolicyName;
    }
    /**
     * @return The description of policy.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The effect scope.
     * 
     */
    public String effectScope() {
        return this.effectScope;
    }
    /**
     * @return The ID of the Control Policy.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The policy document.
     * 
     */
    public String policyDocument() {
        return this.policyDocument;
    }
    /**
     * @return The ID of policy.
     * 
     */
    public String policyId() {
        return this.policyId;
    }
    /**
     * @return The type of policy.
     * 
     */
    public String policyType() {
        return this.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetControlPoliciesPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer attachmentCount;
        private String controlPolicyName;
        private String description;
        private String effectScope;
        private String id;
        private String policyDocument;
        private String policyId;
        private String policyType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetControlPoliciesPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentCount = defaults.attachmentCount;
    	      this.controlPolicyName = defaults.controlPolicyName;
    	      this.description = defaults.description;
    	      this.effectScope = defaults.effectScope;
    	      this.id = defaults.id;
    	      this.policyDocument = defaults.policyDocument;
    	      this.policyId = defaults.policyId;
    	      this.policyType = defaults.policyType;
        }

        public Builder attachmentCount(Integer attachmentCount) {
            this.attachmentCount = Objects.requireNonNull(attachmentCount);
            return this;
        }
        public Builder controlPolicyName(String controlPolicyName) {
            this.controlPolicyName = Objects.requireNonNull(controlPolicyName);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder effectScope(String effectScope) {
            this.effectScope = Objects.requireNonNull(effectScope);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder policyDocument(String policyDocument) {
            this.policyDocument = Objects.requireNonNull(policyDocument);
            return this;
        }
        public Builder policyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }
        public Builder policyType(String policyType) {
            this.policyType = Objects.requireNonNull(policyType);
            return this;
        }        public GetControlPoliciesPolicy build() {
            return new GetControlPoliciesPolicy(attachmentCount, controlPolicyName, description, effectScope, id, policyDocument, policyId, policyType);
        }
    }
}