// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationRecorderState extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationRecorderState Empty = new ConfigurationRecorderState();

    /**
     * Whether to use the enterprise version configuration audit. Valid values: `true` and `false`. Default value `false`. For enterprise accounts, We recommend you to use the resource alicloud_config_aggregator.
     * 
     */
    @Import(name="enterpriseEdition")
    private @Nullable Output<Boolean> enterpriseEdition;

    /**
     * @return Whether to use the enterprise version configuration audit. Valid values: `true` and `false`. Default value `false`. For enterprise accounts, We recommend you to use the resource alicloud_config_aggregator.
     * 
     */
    public Optional<Output<Boolean>> enterpriseEdition() {
        return Optional.ofNullable(this.enterpriseEdition);
    }

    /**
     * Enterprise version configuration audit enabled status. Values: `REGISTRABLE`: Not enabled, `BUILDING`: Building and `REGISTERED`: Enabled.
     * 
     */
    @Import(name="organizationEnableStatus")
    private @Nullable Output<String> organizationEnableStatus;

    /**
     * @return Enterprise version configuration audit enabled status. Values: `REGISTRABLE`: Not enabled, `BUILDING`: Building and `REGISTERED`: Enabled.
     * 
     */
    public Optional<Output<String>> organizationEnableStatus() {
        return Optional.ofNullable(this.organizationEnableStatus);
    }

    /**
     * The ID of the Enterprise management account.
     * 
     */
    @Import(name="organizationMasterId")
    private @Nullable Output<Integer> organizationMasterId;

    /**
     * @return The ID of the Enterprise management account.
     * 
     */
    public Optional<Output<Integer>> organizationMasterId() {
        return Optional.ofNullable(this.organizationMasterId);
    }

    /**
     * A list of resource types to be monitored. [Resource types that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
     * * If you use an ordinary account, the `resource_types` supports the update operation after the process of creation is completed.
     * * If you use an enterprise account, the `resource_types` does not support updating.
     * 
     */
    @Import(name="resourceTypes")
    private @Nullable Output<List<String>> resourceTypes;

    /**
     * @return A list of resource types to be monitored. [Resource types that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
     * * If you use an ordinary account, the `resource_types` supports the update operation after the process of creation is completed.
     * * If you use an enterprise account, the `resource_types` does not support updating.
     * 
     */
    public Optional<Output<List<String>>> resourceTypes() {
        return Optional.ofNullable(this.resourceTypes);
    }

    /**
     * Status of resource monitoring. Values: `REGISTRABLE`: Not registered, `BUILDING`: Under construction, `REGISTERED`: Registered and `REBUILDING`: Rebuilding.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of resource monitoring. Values: `REGISTRABLE`: Not registered, `BUILDING`: Under construction, `REGISTERED`: Registered and `REBUILDING`: Rebuilding.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private ConfigurationRecorderState() {}

    private ConfigurationRecorderState(ConfigurationRecorderState $) {
        this.enterpriseEdition = $.enterpriseEdition;
        this.organizationEnableStatus = $.organizationEnableStatus;
        this.organizationMasterId = $.organizationMasterId;
        this.resourceTypes = $.resourceTypes;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationRecorderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationRecorderState $;

        public Builder() {
            $ = new ConfigurationRecorderState();
        }

        public Builder(ConfigurationRecorderState defaults) {
            $ = new ConfigurationRecorderState(Objects.requireNonNull(defaults));
        }

        /**
         * @param enterpriseEdition Whether to use the enterprise version configuration audit. Valid values: `true` and `false`. Default value `false`. For enterprise accounts, We recommend you to use the resource alicloud_config_aggregator.
         * 
         * @return builder
         * 
         */
        public Builder enterpriseEdition(@Nullable Output<Boolean> enterpriseEdition) {
            $.enterpriseEdition = enterpriseEdition;
            return this;
        }

        /**
         * @param enterpriseEdition Whether to use the enterprise version configuration audit. Valid values: `true` and `false`. Default value `false`. For enterprise accounts, We recommend you to use the resource alicloud_config_aggregator.
         * 
         * @return builder
         * 
         */
        public Builder enterpriseEdition(Boolean enterpriseEdition) {
            return enterpriseEdition(Output.of(enterpriseEdition));
        }

        /**
         * @param organizationEnableStatus Enterprise version configuration audit enabled status. Values: `REGISTRABLE`: Not enabled, `BUILDING`: Building and `REGISTERED`: Enabled.
         * 
         * @return builder
         * 
         */
        public Builder organizationEnableStatus(@Nullable Output<String> organizationEnableStatus) {
            $.organizationEnableStatus = organizationEnableStatus;
            return this;
        }

        /**
         * @param organizationEnableStatus Enterprise version configuration audit enabled status. Values: `REGISTRABLE`: Not enabled, `BUILDING`: Building and `REGISTERED`: Enabled.
         * 
         * @return builder
         * 
         */
        public Builder organizationEnableStatus(String organizationEnableStatus) {
            return organizationEnableStatus(Output.of(organizationEnableStatus));
        }

        /**
         * @param organizationMasterId The ID of the Enterprise management account.
         * 
         * @return builder
         * 
         */
        public Builder organizationMasterId(@Nullable Output<Integer> organizationMasterId) {
            $.organizationMasterId = organizationMasterId;
            return this;
        }

        /**
         * @param organizationMasterId The ID of the Enterprise management account.
         * 
         * @return builder
         * 
         */
        public Builder organizationMasterId(Integer organizationMasterId) {
            return organizationMasterId(Output.of(organizationMasterId));
        }

        /**
         * @param resourceTypes A list of resource types to be monitored. [Resource types that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
         * * If you use an ordinary account, the `resource_types` supports the update operation after the process of creation is completed.
         * * If you use an enterprise account, the `resource_types` does not support updating.
         * 
         * @return builder
         * 
         */
        public Builder resourceTypes(@Nullable Output<List<String>> resourceTypes) {
            $.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * @param resourceTypes A list of resource types to be monitored. [Resource types that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
         * * If you use an ordinary account, the `resource_types` supports the update operation after the process of creation is completed.
         * * If you use an enterprise account, the `resource_types` does not support updating.
         * 
         * @return builder
         * 
         */
        public Builder resourceTypes(List<String> resourceTypes) {
            return resourceTypes(Output.of(resourceTypes));
        }

        /**
         * @param resourceTypes A list of resource types to be monitored. [Resource types that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
         * * If you use an ordinary account, the `resource_types` supports the update operation after the process of creation is completed.
         * * If you use an enterprise account, the `resource_types` does not support updating.
         * 
         * @return builder
         * 
         */
        public Builder resourceTypes(String... resourceTypes) {
            return resourceTypes(List.of(resourceTypes));
        }

        /**
         * @param status Status of resource monitoring. Values: `REGISTRABLE`: Not registered, `BUILDING`: Under construction, `REGISTERED`: Registered and `REBUILDING`: Rebuilding.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of resource monitoring. Values: `REGISTRABLE`: Not registered, `BUILDING`: Under construction, `REGISTERED`: Registered and `REBUILDING`: Rebuilding.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public ConfigurationRecorderState build() {
            return $;
        }
    }

}