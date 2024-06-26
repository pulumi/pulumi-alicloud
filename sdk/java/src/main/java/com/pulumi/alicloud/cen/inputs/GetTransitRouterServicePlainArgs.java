// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTransitRouterServicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransitRouterServicePlainArgs Empty = new GetTransitRouterServicePlainArgs();

    /**
     * Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
     * 
     * &gt; **NOTE:** Setting `enable = &#34;On&#34;` to open the CEN Transit Router Service that means you have read and agreed the [CEN Terms of Service](https://help.aliyun.com/document_detail/66667.html). The service can not closed once it is opened.
     * 
     */
    @Import(name="enable")
    private @Nullable String enable;

    /**
     * @return Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
     * 
     * &gt; **NOTE:** Setting `enable = &#34;On&#34;` to open the CEN Transit Router Service that means you have read and agreed the [CEN Terms of Service](https://help.aliyun.com/document_detail/66667.html). The service can not closed once it is opened.
     * 
     */
    public Optional<String> enable() {
        return Optional.ofNullable(this.enable);
    }

    private GetTransitRouterServicePlainArgs() {}

    private GetTransitRouterServicePlainArgs(GetTransitRouterServicePlainArgs $) {
        this.enable = $.enable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransitRouterServicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransitRouterServicePlainArgs $;

        public Builder() {
            $ = new GetTransitRouterServicePlainArgs();
        }

        public Builder(GetTransitRouterServicePlainArgs defaults) {
            $ = new GetTransitRouterServicePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enable Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
         * 
         * &gt; **NOTE:** Setting `enable = &#34;On&#34;` to open the CEN Transit Router Service that means you have read and agreed the [CEN Terms of Service](https://help.aliyun.com/document_detail/66667.html). The service can not closed once it is opened.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable String enable) {
            $.enable = enable;
            return this;
        }

        public GetTransitRouterServicePlainArgs build() {
            return $;
        }
    }

}
