// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLogShipperArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLogShipperArgs Empty = new GetLogShipperArgs();

    /**
     * Setting the value to `On` to enable the service. Valid values: `On` or `Off`. Default to `Off`.
     * 
     * &gt; **NOTE:** Setting `enable = &#34;On&#34;` to open the Threat Detection Log Shipper that means you have read and agreed the [Threat Detection Log Shipper Terms of Service](https://help.aliyun.com/document_detail/170157.html). The service can not closed once it is opened.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<String> enable;

    /**
     * @return Setting the value to `On` to enable the service. Valid values: `On` or `Off`. Default to `Off`.
     * 
     * &gt; **NOTE:** Setting `enable = &#34;On&#34;` to open the Threat Detection Log Shipper that means you have read and agreed the [Threat Detection Log Shipper Terms of Service](https://help.aliyun.com/document_detail/170157.html). The service can not closed once it is opened.
     * 
     */
    public Optional<Output<String>> enable() {
        return Optional.ofNullable(this.enable);
    }

    private GetLogShipperArgs() {}

    private GetLogShipperArgs(GetLogShipperArgs $) {
        this.enable = $.enable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLogShipperArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLogShipperArgs $;

        public Builder() {
            $ = new GetLogShipperArgs();
        }

        public Builder(GetLogShipperArgs defaults) {
            $ = new GetLogShipperArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enable Setting the value to `On` to enable the service. Valid values: `On` or `Off`. Default to `Off`.
         * 
         * &gt; **NOTE:** Setting `enable = &#34;On&#34;` to open the Threat Detection Log Shipper that means you have read and agreed the [Threat Detection Log Shipper Terms of Service](https://help.aliyun.com/document_detail/170157.html). The service can not closed once it is opened.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<String> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Setting the value to `On` to enable the service. Valid values: `On` or `Off`. Default to `Off`.
         * 
         * &gt; **NOTE:** Setting `enable = &#34;On&#34;` to open the Threat Detection Log Shipper that means you have read and agreed the [Threat Detection Log Shipper Terms of Service](https://help.aliyun.com/document_detail/170157.html). The service can not closed once it is opened.
         * 
         * @return builder
         * 
         */
        public Builder enable(String enable) {
            return enable(Output.of(enable));
        }

        public GetLogShipperArgs build() {
            return $;
        }
    }

}
