// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dataworks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceSharedRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceSharedRuleArgs Empty = new DataSourceSharedRuleArgs();

    /**
     * The ID of the data source, that is, the unique identifier of the data source.
     * 
     */
    @Import(name="dataSourceId", required=true)
    private Output<Integer> dataSourceId;

    /**
     * @return The ID of the data source, that is, the unique identifier of the data source.
     * 
     */
    public Output<Integer> dataSourceId() {
        return this.dataSourceId;
    }

    /**
     * The environment type of the data source shared to the target project, such as Dev (Development Environment) and Prod (production environment).
     * 
     */
    @Import(name="envType", required=true)
    private Output<String> envType;

    /**
     * @return The environment type of the data source shared to the target project, such as Dev (Development Environment) and Prod (production environment).
     * 
     */
    public Output<String> envType() {
        return this.envType;
    }

    /**
     * The target user of the data source permission policy, which is null to share to the project.
     * 
     */
    @Import(name="sharedUser")
    private @Nullable Output<String> sharedUser;

    /**
     * @return The target user of the data source permission policy, which is null to share to the project.
     * 
     */
    public Optional<Output<String>> sharedUser() {
        return Optional.ofNullable(this.sharedUser);
    }

    /**
     * The ID of the project to which the data source is shared.
     * 
     */
    @Import(name="targetProjectId", required=true)
    private Output<Integer> targetProjectId;

    /**
     * @return The ID of the project to which the data source is shared.
     * 
     */
    public Output<Integer> targetProjectId() {
        return this.targetProjectId;
    }

    private DataSourceSharedRuleArgs() {}

    private DataSourceSharedRuleArgs(DataSourceSharedRuleArgs $) {
        this.dataSourceId = $.dataSourceId;
        this.envType = $.envType;
        this.sharedUser = $.sharedUser;
        this.targetProjectId = $.targetProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceSharedRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceSharedRuleArgs $;

        public Builder() {
            $ = new DataSourceSharedRuleArgs();
        }

        public Builder(DataSourceSharedRuleArgs defaults) {
            $ = new DataSourceSharedRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataSourceId The ID of the data source, that is, the unique identifier of the data source.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceId(Output<Integer> dataSourceId) {
            $.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * @param dataSourceId The ID of the data source, that is, the unique identifier of the data source.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceId(Integer dataSourceId) {
            return dataSourceId(Output.of(dataSourceId));
        }

        /**
         * @param envType The environment type of the data source shared to the target project, such as Dev (Development Environment) and Prod (production environment).
         * 
         * @return builder
         * 
         */
        public Builder envType(Output<String> envType) {
            $.envType = envType;
            return this;
        }

        /**
         * @param envType The environment type of the data source shared to the target project, such as Dev (Development Environment) and Prod (production environment).
         * 
         * @return builder
         * 
         */
        public Builder envType(String envType) {
            return envType(Output.of(envType));
        }

        /**
         * @param sharedUser The target user of the data source permission policy, which is null to share to the project.
         * 
         * @return builder
         * 
         */
        public Builder sharedUser(@Nullable Output<String> sharedUser) {
            $.sharedUser = sharedUser;
            return this;
        }

        /**
         * @param sharedUser The target user of the data source permission policy, which is null to share to the project.
         * 
         * @return builder
         * 
         */
        public Builder sharedUser(String sharedUser) {
            return sharedUser(Output.of(sharedUser));
        }

        /**
         * @param targetProjectId The ID of the project to which the data source is shared.
         * 
         * @return builder
         * 
         */
        public Builder targetProjectId(Output<Integer> targetProjectId) {
            $.targetProjectId = targetProjectId;
            return this;
        }

        /**
         * @param targetProjectId The ID of the project to which the data source is shared.
         * 
         * @return builder
         * 
         */
        public Builder targetProjectId(Integer targetProjectId) {
            return targetProjectId(Output.of(targetProjectId));
        }

        public DataSourceSharedRuleArgs build() {
            if ($.dataSourceId == null) {
                throw new MissingRequiredPropertyException("DataSourceSharedRuleArgs", "dataSourceId");
            }
            if ($.envType == null) {
                throw new MissingRequiredPropertyException("DataSourceSharedRuleArgs", "envType");
            }
            if ($.targetProjectId == null) {
                throw new MissingRequiredPropertyException("DataSourceSharedRuleArgs", "targetProjectId");
            }
            return $;
        }
    }

}