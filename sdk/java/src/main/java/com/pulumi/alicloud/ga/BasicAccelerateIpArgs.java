// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class BasicAccelerateIpArgs extends com.pulumi.resources.ResourceArgs {

    public static final BasicAccelerateIpArgs Empty = new BasicAccelerateIpArgs();

    /**
     * The ID of the Basic GA instance.
     * 
     */
    @Import(name="acceleratorId", required=true)
    private Output<String> acceleratorId;

    /**
     * @return The ID of the Basic GA instance.
     * 
     */
    public Output<String> acceleratorId() {
        return this.acceleratorId;
    }

    /**
     * The ID of the Basic Ip Set.
     * 
     */
    @Import(name="ipSetId", required=true)
    private Output<String> ipSetId;

    /**
     * @return The ID of the Basic Ip Set.
     * 
     */
    public Output<String> ipSetId() {
        return this.ipSetId;
    }

    private BasicAccelerateIpArgs() {}

    private BasicAccelerateIpArgs(BasicAccelerateIpArgs $) {
        this.acceleratorId = $.acceleratorId;
        this.ipSetId = $.ipSetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BasicAccelerateIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicAccelerateIpArgs $;

        public Builder() {
            $ = new BasicAccelerateIpArgs();
        }

        public Builder(BasicAccelerateIpArgs defaults) {
            $ = new BasicAccelerateIpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorId The ID of the Basic GA instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(Output<String> acceleratorId) {
            $.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * @param acceleratorId The ID of the Basic GA instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(String acceleratorId) {
            return acceleratorId(Output.of(acceleratorId));
        }

        /**
         * @param ipSetId The ID of the Basic Ip Set.
         * 
         * @return builder
         * 
         */
        public Builder ipSetId(Output<String> ipSetId) {
            $.ipSetId = ipSetId;
            return this;
        }

        /**
         * @param ipSetId The ID of the Basic Ip Set.
         * 
         * @return builder
         * 
         */
        public Builder ipSetId(String ipSetId) {
            return ipSetId(Output.of(ipSetId));
        }

        public BasicAccelerateIpArgs build() {
            if ($.acceleratorId == null) {
                throw new MissingRequiredPropertyException("BasicAccelerateIpArgs", "acceleratorId");
            }
            if ($.ipSetId == null) {
                throw new MissingRequiredPropertyException("BasicAccelerateIpArgs", "ipSetId");
            }
            return $;
        }
    }

}
