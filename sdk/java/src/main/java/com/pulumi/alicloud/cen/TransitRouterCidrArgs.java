// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitRouterCidrArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransitRouterCidrArgs Empty = new TransitRouterCidrArgs();

    /**
     * The new CIDR block of the transit router.
     * 
     */
    @Import(name="cidr", required=true)
    private Output<String> cidr;

    /**
     * @return The new CIDR block of the transit router.
     * 
     */
    public Output<String> cidr() {
        return this.cidr;
    }

    /**
     * The new description of the transit router CIDR block.
     * The description must be 1 to 256 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The new description of the transit router CIDR block.
     * The description must be 1 to 256 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies whether to allow the system to automatically add a route that points to the CIDR block to the route table of the transit router.
     * 
     */
    @Import(name="publishCidrRoute")
    private @Nullable Output<Boolean> publishCidrRoute;

    /**
     * @return Specifies whether to allow the system to automatically add a route that points to the CIDR block to the route table of the transit router.
     * 
     */
    public Optional<Output<Boolean>> publishCidrRoute() {
        return Optional.ofNullable(this.publishCidrRoute);
    }

    /**
     * The new name of the transit router CIDR block.
     * The name must be 1 to 128 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.
     * 
     */
    @Import(name="transitRouterCidrName")
    private @Nullable Output<String> transitRouterCidrName;

    /**
     * @return The new name of the transit router CIDR block.
     * The name must be 1 to 128 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.
     * 
     */
    public Optional<Output<String>> transitRouterCidrName() {
        return Optional.ofNullable(this.transitRouterCidrName);
    }

    /**
     * The ID of the transit router.
     * 
     */
    @Import(name="transitRouterId", required=true)
    private Output<String> transitRouterId;

    /**
     * @return The ID of the transit router.
     * 
     */
    public Output<String> transitRouterId() {
        return this.transitRouterId;
    }

    private TransitRouterCidrArgs() {}

    private TransitRouterCidrArgs(TransitRouterCidrArgs $) {
        this.cidr = $.cidr;
        this.description = $.description;
        this.publishCidrRoute = $.publishCidrRoute;
        this.transitRouterCidrName = $.transitRouterCidrName;
        this.transitRouterId = $.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitRouterCidrArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitRouterCidrArgs $;

        public Builder() {
            $ = new TransitRouterCidrArgs();
        }

        public Builder(TransitRouterCidrArgs defaults) {
            $ = new TransitRouterCidrArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidr The new CIDR block of the transit router.
         * 
         * @return builder
         * 
         */
        public Builder cidr(Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr The new CIDR block of the transit router.
         * 
         * @return builder
         * 
         */
        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        /**
         * @param description The new description of the transit router CIDR block.
         * The description must be 1 to 256 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The new description of the transit router CIDR block.
         * The description must be 1 to 256 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param publishCidrRoute Specifies whether to allow the system to automatically add a route that points to the CIDR block to the route table of the transit router.
         * 
         * @return builder
         * 
         */
        public Builder publishCidrRoute(@Nullable Output<Boolean> publishCidrRoute) {
            $.publishCidrRoute = publishCidrRoute;
            return this;
        }

        /**
         * @param publishCidrRoute Specifies whether to allow the system to automatically add a route that points to the CIDR block to the route table of the transit router.
         * 
         * @return builder
         * 
         */
        public Builder publishCidrRoute(Boolean publishCidrRoute) {
            return publishCidrRoute(Output.of(publishCidrRoute));
        }

        /**
         * @param transitRouterCidrName The new name of the transit router CIDR block.
         * The name must be 1 to 128 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterCidrName(@Nullable Output<String> transitRouterCidrName) {
            $.transitRouterCidrName = transitRouterCidrName;
            return this;
        }

        /**
         * @param transitRouterCidrName The new name of the transit router CIDR block.
         * The name must be 1 to 128 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.
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
        public Builder transitRouterId(Output<String> transitRouterId) {
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

        public TransitRouterCidrArgs build() {
            if ($.cidr == null) {
                throw new MissingRequiredPropertyException("TransitRouterCidrArgs", "cidr");
            }
            if ($.transitRouterId == null) {
                throw new MissingRequiredPropertyException("TransitRouterCidrArgs", "transitRouterId");
            }
            return $;
        }
    }

}
