// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetElasticityAssurancesAssuranceAllocatedResource {
    /**
     * @return Instance type.
     * 
     */
    private String instanceType;
    /**
     * @return The total number of instances that need to be reserved within an instance type.
     * 
     */
    private Integer totalAmount;
    /**
     * @return The number of instances that have been used.
     * 
     */
    private Integer usedAmount;
    /**
     * @return The zone ID.
     * 
     */
    private String zoneId;

    private GetElasticityAssurancesAssuranceAllocatedResource() {}
    /**
     * @return Instance type.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return The total number of instances that need to be reserved within an instance type.
     * 
     */
    public Integer totalAmount() {
        return this.totalAmount;
    }
    /**
     * @return The number of instances that have been used.
     * 
     */
    public Integer usedAmount() {
        return this.usedAmount;
    }
    /**
     * @return The zone ID.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetElasticityAssurancesAssuranceAllocatedResource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String instanceType;
        private Integer totalAmount;
        private Integer usedAmount;
        private String zoneId;
        public Builder() {}
        public Builder(GetElasticityAssurancesAssuranceAllocatedResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.totalAmount = defaults.totalAmount;
    	      this.usedAmount = defaults.usedAmount;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        @CustomType.Setter
        public Builder totalAmount(Integer totalAmount) {
            this.totalAmount = Objects.requireNonNull(totalAmount);
            return this;
        }
        @CustomType.Setter
        public Builder usedAmount(Integer usedAmount) {
            this.usedAmount = Objects.requireNonNull(usedAmount);
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }
        public GetElasticityAssurancesAssuranceAllocatedResource build() {
            final var o = new GetElasticityAssurancesAssuranceAllocatedResource();
            o.instanceType = instanceType;
            o.totalAmount = totalAmount;
            o.usedAmount = usedAmount;
            o.zoneId = zoneId;
            return o;
        }
    }
}