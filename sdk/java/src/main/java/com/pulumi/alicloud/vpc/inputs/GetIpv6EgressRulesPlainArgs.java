// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIpv6EgressRulesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIpv6EgressRulesPlainArgs Empty = new GetIpv6EgressRulesPlainArgs();

    /**
     * A list of Ipv6 Egress Rule IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Ipv6 Egress Rule IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The ID of the instance that is associated with the IPv6 address to which the egress-only rule is applied.
     * 
     */
    @Import(name="instanceId")
    private @Nullable String instanceId;

    /**
     * @return The ID of the instance that is associated with the IPv6 address to which the egress-only rule is applied.
     * 
     */
    public Optional<String> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="ipv6EgressRuleName")
    private @Nullable String ipv6EgressRuleName;

    /**
     * @return The name of the resource.
     * 
     */
    public Optional<String> ipv6EgressRuleName() {
        return Optional.ofNullable(this.ipv6EgressRuleName);
    }

    /**
     * The ID of the IPv6 gateway.
     * 
     */
    @Import(name="ipv6GatewayId", required=true)
    private String ipv6GatewayId;

    /**
     * @return The ID of the IPv6 gateway.
     * 
     */
    public String ipv6GatewayId() {
        return this.ipv6GatewayId;
    }

    /**
     * A regex string to filter results by Ipv6 Egress Rule name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Ipv6 Egress Rule name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The status of the resource. Valid values: `Available`, `Deleting`, `Pending`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the resource. Valid values: `Available`, `Deleting`, `Pending`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetIpv6EgressRulesPlainArgs() {}

    private GetIpv6EgressRulesPlainArgs(GetIpv6EgressRulesPlainArgs $) {
        this.ids = $.ids;
        this.instanceId = $.instanceId;
        this.ipv6EgressRuleName = $.ipv6EgressRuleName;
        this.ipv6GatewayId = $.ipv6GatewayId;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpv6EgressRulesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpv6EgressRulesPlainArgs $;

        public Builder() {
            $ = new GetIpv6EgressRulesPlainArgs();
        }

        public Builder(GetIpv6EgressRulesPlainArgs defaults) {
            $ = new GetIpv6EgressRulesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Ipv6 Egress Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Ipv6 Egress Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param instanceId The ID of the instance that is associated with the IPv6 address to which the egress-only rule is applied.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param ipv6EgressRuleName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder ipv6EgressRuleName(@Nullable String ipv6EgressRuleName) {
            $.ipv6EgressRuleName = ipv6EgressRuleName;
            return this;
        }

        /**
         * @param ipv6GatewayId The ID of the IPv6 gateway.
         * 
         * @return builder
         * 
         */
        public Builder ipv6GatewayId(String ipv6GatewayId) {
            $.ipv6GatewayId = ipv6GatewayId;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Ipv6 Egress Rule name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param status The status of the resource. Valid values: `Available`, `Deleting`, `Pending`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetIpv6EgressRulesPlainArgs build() {
            if ($.ipv6GatewayId == null) {
                throw new MissingRequiredPropertyException("GetIpv6EgressRulesPlainArgs", "ipv6GatewayId");
            }
            return $;
        }
    }

}