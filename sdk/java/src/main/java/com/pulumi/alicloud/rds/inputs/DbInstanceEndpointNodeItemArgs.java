// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DbInstanceEndpointNodeItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final DbInstanceEndpointNodeItemArgs Empty = new DbInstanceEndpointNodeItemArgs();

    /**
     * The ID of the node.
     * 
     */
    @Import(name="nodeId", required=true)
    private Output<String> nodeId;

    /**
     * @return The ID of the node.
     * 
     */
    public Output<String> nodeId() {
        return this.nodeId;
    }

    /**
     * The weight of the node. Read requests are distributed based on the weight.Valid values: 0 to 100.
     * 
     */
    @Import(name="weight", required=true)
    private Output<Integer> weight;

    /**
     * @return The weight of the node. Read requests are distributed based on the weight.Valid values: 0 to 100.
     * 
     */
    public Output<Integer> weight() {
        return this.weight;
    }

    private DbInstanceEndpointNodeItemArgs() {}

    private DbInstanceEndpointNodeItemArgs(DbInstanceEndpointNodeItemArgs $) {
        this.nodeId = $.nodeId;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DbInstanceEndpointNodeItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DbInstanceEndpointNodeItemArgs $;

        public Builder() {
            $ = new DbInstanceEndpointNodeItemArgs();
        }

        public Builder(DbInstanceEndpointNodeItemArgs defaults) {
            $ = new DbInstanceEndpointNodeItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodeId The ID of the node.
         * 
         * @return builder
         * 
         */
        public Builder nodeId(Output<String> nodeId) {
            $.nodeId = nodeId;
            return this;
        }

        /**
         * @param nodeId The ID of the node.
         * 
         * @return builder
         * 
         */
        public Builder nodeId(String nodeId) {
            return nodeId(Output.of(nodeId));
        }

        /**
         * @param weight The weight of the node. Read requests are distributed based on the weight.Valid values: 0 to 100.
         * 
         * @return builder
         * 
         */
        public Builder weight(Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight The weight of the node. Read requests are distributed based on the weight.Valid values: 0 to 100.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public DbInstanceEndpointNodeItemArgs build() {
            if ($.nodeId == null) {
                throw new MissingRequiredPropertyException("DbInstanceEndpointNodeItemArgs", "nodeId");
            }
            if ($.weight == null) {
                throw new MissingRequiredPropertyException("DbInstanceEndpointNodeItemArgs", "weight");
            }
            return $;
        }
    }

}