// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLogShipperPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLogShipperPlainArgs Empty = new GetLogShipperPlainArgs();

    /**
     * Setting the value to `On` to enable the service. Valid values: `On` or `Off`. Default to `Off`.
     * 
     */
    @Import(name="enable")
    private @Nullable String enable;

    /**
     * @return Setting the value to `On` to enable the service. Valid values: `On` or `Off`. Default to `Off`.
     * 
     */
    public Optional<String> enable() {
        return Optional.ofNullable(this.enable);
    }

    private GetLogShipperPlainArgs() {}

    private GetLogShipperPlainArgs(GetLogShipperPlainArgs $) {
        this.enable = $.enable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLogShipperPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLogShipperPlainArgs $;

        public Builder() {
            $ = new GetLogShipperPlainArgs();
        }

        public Builder(GetLogShipperPlainArgs defaults) {
            $ = new GetLogShipperPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enable Setting the value to `On` to enable the service. Valid values: `On` or `Off`. Default to `Off`.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable String enable) {
            $.enable = enable;
            return this;
        }

        public GetLogShipperPlainArgs build() {
            return $;
        }
    }

}