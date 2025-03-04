// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DbResourceGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final DbResourceGroupArgs Empty = new DbResourceGroupArgs();

    /**
     * The instance ID.&gt; You can call the DescribeDBInstances operation to view the instance IDs of all AnalyticDB PostgreSQL instances in the target region.
     * 
     */
    @Import(name="dbInstanceId", required=true)
    private Output<String> dbInstanceId;

    /**
     * @return The instance ID.&gt; You can call the DescribeDBInstances operation to view the instance IDs of all AnalyticDB PostgreSQL instances in the target region.
     * 
     */
    public Output<String> dbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * Resource group configuration.
     * 
     */
    @Import(name="resourceGroupConfig", required=true)
    private Output<String> resourceGroupConfig;

    /**
     * @return Resource group configuration.
     * 
     */
    public Output<String> resourceGroupConfig() {
        return this.resourceGroupConfig;
    }

    /**
     * Resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Role List
     * 
     */
    @Import(name="roleLists")
    private @Nullable Output<List<String>> roleLists;

    /**
     * @return Role List
     * 
     */
    public Optional<Output<List<String>>> roleLists() {
        return Optional.ofNullable(this.roleLists);
    }

    private DbResourceGroupArgs() {}

    private DbResourceGroupArgs(DbResourceGroupArgs $) {
        this.dbInstanceId = $.dbInstanceId;
        this.resourceGroupConfig = $.resourceGroupConfig;
        this.resourceGroupName = $.resourceGroupName;
        this.roleLists = $.roleLists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DbResourceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DbResourceGroupArgs $;

        public Builder() {
            $ = new DbResourceGroupArgs();
        }

        public Builder(DbResourceGroupArgs defaults) {
            $ = new DbResourceGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbInstanceId The instance ID.&gt; You can call the DescribeDBInstances operation to view the instance IDs of all AnalyticDB PostgreSQL instances in the target region.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(Output<String> dbInstanceId) {
            $.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * @param dbInstanceId The instance ID.&gt; You can call the DescribeDBInstances operation to view the instance IDs of all AnalyticDB PostgreSQL instances in the target region.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(String dbInstanceId) {
            return dbInstanceId(Output.of(dbInstanceId));
        }

        /**
         * @param resourceGroupConfig Resource group configuration.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupConfig(Output<String> resourceGroupConfig) {
            $.resourceGroupConfig = resourceGroupConfig;
            return this;
        }

        /**
         * @param resourceGroupConfig Resource group configuration.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupConfig(String resourceGroupConfig) {
            return resourceGroupConfig(Output.of(resourceGroupConfig));
        }

        /**
         * @param resourceGroupName Resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param roleLists Role List
         * 
         * @return builder
         * 
         */
        public Builder roleLists(@Nullable Output<List<String>> roleLists) {
            $.roleLists = roleLists;
            return this;
        }

        /**
         * @param roleLists Role List
         * 
         * @return builder
         * 
         */
        public Builder roleLists(List<String> roleLists) {
            return roleLists(Output.of(roleLists));
        }

        /**
         * @param roleLists Role List
         * 
         * @return builder
         * 
         */
        public Builder roleLists(String... roleLists) {
            return roleLists(List.of(roleLists));
        }

        public DbResourceGroupArgs build() {
            if ($.dbInstanceId == null) {
                throw new MissingRequiredPropertyException("DbResourceGroupArgs", "dbInstanceId");
            }
            if ($.resourceGroupConfig == null) {
                throw new MissingRequiredPropertyException("DbResourceGroupArgs", "resourceGroupConfig");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("DbResourceGroupArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
