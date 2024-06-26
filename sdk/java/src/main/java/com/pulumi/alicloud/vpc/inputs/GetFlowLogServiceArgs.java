// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFlowLogServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFlowLogServiceArgs Empty = new GetFlowLogServiceArgs();

    /**
     * Setting the value to `On` to enable the service. If has been enabled, return the result. Default value: `Off`. Valid values: `On` and `Off`.
     * 
     * &gt; **NOTE:** Setting `enable = &#34;On&#34;` to open the Vpc Flow Log service that means you have read and agreed the [Vpc Flow Log Terms of Service](https://help.aliyun.com/zh/vpc/support/vpc-terms-of-service). The service can not closed once it is opened.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<String> enable;

    /**
     * @return Setting the value to `On` to enable the service. If has been enabled, return the result. Default value: `Off`. Valid values: `On` and `Off`.
     * 
     * &gt; **NOTE:** Setting `enable = &#34;On&#34;` to open the Vpc Flow Log service that means you have read and agreed the [Vpc Flow Log Terms of Service](https://help.aliyun.com/zh/vpc/support/vpc-terms-of-service). The service can not closed once it is opened.
     * 
     */
    public Optional<Output<String>> enable() {
        return Optional.ofNullable(this.enable);
    }

    private GetFlowLogServiceArgs() {}

    private GetFlowLogServiceArgs(GetFlowLogServiceArgs $) {
        this.enable = $.enable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFlowLogServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFlowLogServiceArgs $;

        public Builder() {
            $ = new GetFlowLogServiceArgs();
        }

        public Builder(GetFlowLogServiceArgs defaults) {
            $ = new GetFlowLogServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enable Setting the value to `On` to enable the service. If has been enabled, return the result. Default value: `Off`. Valid values: `On` and `Off`.
         * 
         * &gt; **NOTE:** Setting `enable = &#34;On&#34;` to open the Vpc Flow Log service that means you have read and agreed the [Vpc Flow Log Terms of Service](https://help.aliyun.com/zh/vpc/support/vpc-terms-of-service). The service can not closed once it is opened.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<String> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Setting the value to `On` to enable the service. If has been enabled, return the result. Default value: `Off`. Valid values: `On` and `Off`.
         * 
         * &gt; **NOTE:** Setting `enable = &#34;On&#34;` to open the Vpc Flow Log service that means you have read and agreed the [Vpc Flow Log Terms of Service](https://help.aliyun.com/zh/vpc/support/vpc-terms-of-service). The service can not closed once it is opened.
         * 
         * @return builder
         * 
         */
        public Builder enable(String enable) {
            return enable(Output.of(enable));
        }

        public GetFlowLogServiceArgs build() {
            return $;
        }
    }

}
