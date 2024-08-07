// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AcceleratorSpareIpAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final AcceleratorSpareIpAttachmentState Empty = new AcceleratorSpareIpAttachmentState();

    /**
     * The ID of the global acceleration instance.
     * 
     */
    @Import(name="acceleratorId")
    private @Nullable Output<String> acceleratorId;

    /**
     * @return The ID of the global acceleration instance.
     * 
     */
    public Optional<Output<String>> acceleratorId() {
        return Optional.ofNullable(this.acceleratorId);
    }

    /**
     * The dry run.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return The dry run.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The standby IP address of CNAME. When the acceleration area is abnormal, the traffic is switched to the standby IP address.
     * 
     */
    @Import(name="spareIp")
    private @Nullable Output<String> spareIp;

    /**
     * @return The standby IP address of CNAME. When the acceleration area is abnormal, the traffic is switched to the standby IP address.
     * 
     */
    public Optional<Output<String>> spareIp() {
        return Optional.ofNullable(this.spareIp);
    }

    /**
     * The status of the standby CNAME IP address.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the standby CNAME IP address.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private AcceleratorSpareIpAttachmentState() {}

    private AcceleratorSpareIpAttachmentState(AcceleratorSpareIpAttachmentState $) {
        this.acceleratorId = $.acceleratorId;
        this.dryRun = $.dryRun;
        this.spareIp = $.spareIp;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AcceleratorSpareIpAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AcceleratorSpareIpAttachmentState $;

        public Builder() {
            $ = new AcceleratorSpareIpAttachmentState();
        }

        public Builder(AcceleratorSpareIpAttachmentState defaults) {
            $ = new AcceleratorSpareIpAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorId The ID of the global acceleration instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(@Nullable Output<String> acceleratorId) {
            $.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * @param acceleratorId The ID of the global acceleration instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(String acceleratorId) {
            return acceleratorId(Output.of(acceleratorId));
        }

        /**
         * @param dryRun The dry run.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun The dry run.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param spareIp The standby IP address of CNAME. When the acceleration area is abnormal, the traffic is switched to the standby IP address.
         * 
         * @return builder
         * 
         */
        public Builder spareIp(@Nullable Output<String> spareIp) {
            $.spareIp = spareIp;
            return this;
        }

        /**
         * @param spareIp The standby IP address of CNAME. When the acceleration area is abnormal, the traffic is switched to the standby IP address.
         * 
         * @return builder
         * 
         */
        public Builder spareIp(String spareIp) {
            return spareIp(Output.of(spareIp));
        }

        /**
         * @param status The status of the standby CNAME IP address.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the standby CNAME IP address.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public AcceleratorSpareIpAttachmentState build() {
            return $;
        }
    }

}
