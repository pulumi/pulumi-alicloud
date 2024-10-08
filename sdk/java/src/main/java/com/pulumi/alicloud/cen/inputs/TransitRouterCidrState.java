// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitRouterCidrState extends com.pulumi.resources.ResourceArgs {

    public static final TransitRouterCidrState Empty = new TransitRouterCidrState();

    /**
     * The cidr of the transit router.
     * 
     */
    @Import(name="cidr")
    private @Nullable Output<String> cidr;

    /**
     * @return The cidr of the transit router.
     * 
     */
    public Optional<Output<String>> cidr() {
        return Optional.ofNullable(this.cidr);
    }

    /**
     * The description of the transit router. The description must be `2` to `256` characters in length, and it must start with English letters, but cannot start with `http://` or `https://`.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the transit router. The description must be `2` to `256` characters in length, and it must start with English letters, but cannot start with `http://` or `https://`.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether to allow automatically adding Transit Router Cidr in Transit Router Route Table. Valid values: `true` and `false`. Default value: `true`.
     * 
     */
    @Import(name="publishCidrRoute")
    private @Nullable Output<Boolean> publishCidrRoute;

    /**
     * @return Whether to allow automatically adding Transit Router Cidr in Transit Router Route Table. Valid values: `true` and `false`. Default value: `true`.
     * 
     */
    public Optional<Output<Boolean>> publishCidrRoute() {
        return Optional.ofNullable(this.publishCidrRoute);
    }

    /**
     * The ID of the transit router cidr.
     * 
     */
    @Import(name="transitRouterCidrId")
    private @Nullable Output<String> transitRouterCidrId;

    /**
     * @return The ID of the transit router cidr.
     * 
     */
    public Optional<Output<String>> transitRouterCidrId() {
        return Optional.ofNullable(this.transitRouterCidrId);
    }

    /**
     * The name of the transit router. The name must be `2` to `128` characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
     * 
     */
    @Import(name="transitRouterCidrName")
    private @Nullable Output<String> transitRouterCidrName;

    /**
     * @return The name of the transit router. The name must be `2` to `128` characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
     * 
     */
    public Optional<Output<String>> transitRouterCidrName() {
        return Optional.ofNullable(this.transitRouterCidrName);
    }

    /**
     * The ID of the transit router.
     * 
     */
    @Import(name="transitRouterId")
    private @Nullable Output<String> transitRouterId;

    /**
     * @return The ID of the transit router.
     * 
     */
    public Optional<Output<String>> transitRouterId() {
        return Optional.ofNullable(this.transitRouterId);
    }

    private TransitRouterCidrState() {}

    private TransitRouterCidrState(TransitRouterCidrState $) {
        this.cidr = $.cidr;
        this.description = $.description;
        this.publishCidrRoute = $.publishCidrRoute;
        this.transitRouterCidrId = $.transitRouterCidrId;
        this.transitRouterCidrName = $.transitRouterCidrName;
        this.transitRouterId = $.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitRouterCidrState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitRouterCidrState $;

        public Builder() {
            $ = new TransitRouterCidrState();
        }

        public Builder(TransitRouterCidrState defaults) {
            $ = new TransitRouterCidrState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidr The cidr of the transit router.
         * 
         * @return builder
         * 
         */
        public Builder cidr(@Nullable Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr The cidr of the transit router.
         * 
         * @return builder
         * 
         */
        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        /**
         * @param description The description of the transit router. The description must be `2` to `256` characters in length, and it must start with English letters, but cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the transit router. The description must be `2` to `256` characters in length, and it must start with English letters, but cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param publishCidrRoute Whether to allow automatically adding Transit Router Cidr in Transit Router Route Table. Valid values: `true` and `false`. Default value: `true`.
         * 
         * @return builder
         * 
         */
        public Builder publishCidrRoute(@Nullable Output<Boolean> publishCidrRoute) {
            $.publishCidrRoute = publishCidrRoute;
            return this;
        }

        /**
         * @param publishCidrRoute Whether to allow automatically adding Transit Router Cidr in Transit Router Route Table. Valid values: `true` and `false`. Default value: `true`.
         * 
         * @return builder
         * 
         */
        public Builder publishCidrRoute(Boolean publishCidrRoute) {
            return publishCidrRoute(Output.of(publishCidrRoute));
        }

        /**
         * @param transitRouterCidrId The ID of the transit router cidr.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterCidrId(@Nullable Output<String> transitRouterCidrId) {
            $.transitRouterCidrId = transitRouterCidrId;
            return this;
        }

        /**
         * @param transitRouterCidrId The ID of the transit router cidr.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterCidrId(String transitRouterCidrId) {
            return transitRouterCidrId(Output.of(transitRouterCidrId));
        }

        /**
         * @param transitRouterCidrName The name of the transit router. The name must be `2` to `128` characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterCidrName(@Nullable Output<String> transitRouterCidrName) {
            $.transitRouterCidrName = transitRouterCidrName;
            return this;
        }

        /**
         * @param transitRouterCidrName The name of the transit router. The name must be `2` to `128` characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterCidrName(String transitRouterCidrName) {
            return transitRouterCidrName(Output.of(transitRouterCidrName));
        }

        /**
         * @param transitRouterId The ID of the transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterId(@Nullable Output<String> transitRouterId) {
            $.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * @param transitRouterId The ID of the transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterId(String transitRouterId) {
            return transitRouterId(Output.of(transitRouterId));
        }

        public TransitRouterCidrState build() {
            return $;
        }
    }

}
