// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nlb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerAdditionalCertificateAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final ListenerAdditionalCertificateAttachmentState Empty = new ListenerAdditionalCertificateAttachmentState();

    /**
     * Certificate ID. Currently, only server certificates are supported.
     * 
     */
    @Import(name="certificateId")
    private @Nullable Output<String> certificateId;

    /**
     * @return Certificate ID. Currently, only server certificates are supported.
     * 
     */
    public Optional<Output<String>> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }

    /**
     * Whether to PreCheck only this request, value: - **true**: sends a check request and does not create a resource. Check items include whether required parameters, request format, and business restrictions have been filled in. If the check fails, the corresponding error is returned. If the check passes, the error code &#39;DryRunOperation&#39; is returned &#39;. - **false** (default): Sends a normal request, returns the HTTP 2xx status code after the check, and directly performs the operation.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Whether to PreCheck only this request, value: - **true**: sends a check request and does not create a resource. Check items include whether required parameters, request format, and business restrictions have been filled in. If the check fails, the corresponding error is returned. If the check passes, the error code &#39;DryRunOperation&#39; is returned &#39;. - **false** (default): Sends a normal request, returns the HTTP 2xx status code after the check, and directly performs the operation.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The ID of the tcpssl listener.
     * 
     */
    @Import(name="listenerId")
    private @Nullable Output<String> listenerId;

    /**
     * @return The ID of the tcpssl listener.
     * 
     */
    public Optional<Output<String>> listenerId() {
        return Optional.ofNullable(this.listenerId);
    }

    /**
     * The status of the resource.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private ListenerAdditionalCertificateAttachmentState() {}

    private ListenerAdditionalCertificateAttachmentState(ListenerAdditionalCertificateAttachmentState $) {
        this.certificateId = $.certificateId;
        this.dryRun = $.dryRun;
        this.listenerId = $.listenerId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerAdditionalCertificateAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerAdditionalCertificateAttachmentState $;

        public Builder() {
            $ = new ListenerAdditionalCertificateAttachmentState();
        }

        public Builder(ListenerAdditionalCertificateAttachmentState defaults) {
            $ = new ListenerAdditionalCertificateAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateId Certificate ID. Currently, only server certificates are supported.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(@Nullable Output<String> certificateId) {
            $.certificateId = certificateId;
            return this;
        }

        /**
         * @param certificateId Certificate ID. Currently, only server certificates are supported.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(String certificateId) {
            return certificateId(Output.of(certificateId));
        }

        /**
         * @param dryRun Whether to PreCheck only this request, value: - **true**: sends a check request and does not create a resource. Check items include whether required parameters, request format, and business restrictions have been filled in. If the check fails, the corresponding error is returned. If the check passes, the error code &#39;DryRunOperation&#39; is returned &#39;. - **false** (default): Sends a normal request, returns the HTTP 2xx status code after the check, and directly performs the operation.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Whether to PreCheck only this request, value: - **true**: sends a check request and does not create a resource. Check items include whether required parameters, request format, and business restrictions have been filled in. If the check fails, the corresponding error is returned. If the check passes, the error code &#39;DryRunOperation&#39; is returned &#39;. - **false** (default): Sends a normal request, returns the HTTP 2xx status code after the check, and directly performs the operation.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param listenerId The ID of the tcpssl listener.
         * 
         * @return builder
         * 
         */
        public Builder listenerId(@Nullable Output<String> listenerId) {
            $.listenerId = listenerId;
            return this;
        }

        /**
         * @param listenerId The ID of the tcpssl listener.
         * 
         * @return builder
         * 
         */
        public Builder listenerId(String listenerId) {
            return listenerId(Output.of(listenerId));
        }

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public ListenerAdditionalCertificateAttachmentState build() {
            return $;
        }
    }

}
