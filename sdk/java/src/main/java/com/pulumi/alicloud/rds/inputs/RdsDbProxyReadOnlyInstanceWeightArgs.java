// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class RdsDbProxyReadOnlyInstanceWeightArgs extends com.pulumi.resources.ResourceArgs {

    public static final RdsDbProxyReadOnlyInstanceWeightArgs Empty = new RdsDbProxyReadOnlyInstanceWeightArgs();

    /**
     * The Id of the instance and its read-only instances that can run database.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The Id of the instance and its read-only instances that can run database.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * Weight of instances that can run the database and their read-only instances. Read weights increase in increments of 100, and the maximum read weight is 10000.
     * 
     */
    @Import(name="weight", required=true)
    private Output<String> weight;

    /**
     * @return Weight of instances that can run the database and their read-only instances. Read weights increase in increments of 100, and the maximum read weight is 10000.
     * 
     */
    public Output<String> weight() {
        return this.weight;
    }

    private RdsDbProxyReadOnlyInstanceWeightArgs() {}

    private RdsDbProxyReadOnlyInstanceWeightArgs(RdsDbProxyReadOnlyInstanceWeightArgs $) {
        this.instanceId = $.instanceId;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RdsDbProxyReadOnlyInstanceWeightArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RdsDbProxyReadOnlyInstanceWeightArgs $;

        public Builder() {
            $ = new RdsDbProxyReadOnlyInstanceWeightArgs();
        }

        public Builder(RdsDbProxyReadOnlyInstanceWeightArgs defaults) {
            $ = new RdsDbProxyReadOnlyInstanceWeightArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceId The Id of the instance and its read-only instances that can run database.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The Id of the instance and its read-only instances that can run database.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param weight Weight of instances that can run the database and their read-only instances. Read weights increase in increments of 100, and the maximum read weight is 10000.
         * 
         * @return builder
         * 
         */
        public Builder weight(Output<String> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight Weight of instances that can run the database and their read-only instances. Read weights increase in increments of 100, and the maximum read weight is 10000.
         * 
         * @return builder
         * 
         */
        public Builder weight(String weight) {
            return weight(Output.of(weight));
        }

        public RdsDbProxyReadOnlyInstanceWeightArgs build() {
            if ($.instanceId == null) {
                throw new MissingRequiredPropertyException("RdsDbProxyReadOnlyInstanceWeightArgs", "instanceId");
            }
            if ($.weight == null) {
                throw new MissingRequiredPropertyException("RdsDbProxyReadOnlyInstanceWeightArgs", "weight");
            }
            return $;
        }
    }

}