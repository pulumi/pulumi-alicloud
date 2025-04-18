// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetListenersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetListenersPlainArgs Empty = new GetListenersPlainArgs();

    /**
     * A regex string to filter results by SLB listener description.
     * 
     */
    @Import(name="descriptionRegex")
    private @Nullable String descriptionRegex;

    /**
     * @return A regex string to filter results by SLB listener description.
     * 
     */
    public Optional<String> descriptionRegex() {
        return Optional.ofNullable(this.descriptionRegex);
    }

    /**
     * Filter listeners by the specified frontend port.
     * 
     */
    @Import(name="frontendPort")
    private @Nullable Integer frontendPort;

    /**
     * @return Filter listeners by the specified frontend port.
     * 
     */
    public Optional<Integer> frontendPort() {
        return Optional.ofNullable(this.frontendPort);
    }

    /**
     * ID of the SLB with listeners.
     * 
     */
    @Import(name="loadBalancerId", required=true)
    private String loadBalancerId;

    /**
     * @return ID of the SLB with listeners.
     * 
     */
    public String loadBalancerId() {
        return this.loadBalancerId;
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
     * Filter listeners by the specified protocol. Valid values: `http`, `https`, `tcp` and `udp`.
     * 
     */
    @Import(name="protocol")
    private @Nullable String protocol;

    /**
     * @return Filter listeners by the specified protocol. Valid values: `http`, `https`, `tcp` and `udp`.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    private GetListenersPlainArgs() {}

    private GetListenersPlainArgs(GetListenersPlainArgs $) {
        this.descriptionRegex = $.descriptionRegex;
        this.frontendPort = $.frontendPort;
        this.loadBalancerId = $.loadBalancerId;
        this.outputFile = $.outputFile;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetListenersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetListenersPlainArgs $;

        public Builder() {
            $ = new GetListenersPlainArgs();
        }

        public Builder(GetListenersPlainArgs defaults) {
            $ = new GetListenersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param descriptionRegex A regex string to filter results by SLB listener description.
         * 
         * @return builder
         * 
         */
        public Builder descriptionRegex(@Nullable String descriptionRegex) {
            $.descriptionRegex = descriptionRegex;
            return this;
        }

        /**
         * @param frontendPort Filter listeners by the specified frontend port.
         * 
         * @return builder
         * 
         */
        public Builder frontendPort(@Nullable Integer frontendPort) {
            $.frontendPort = frontendPort;
            return this;
        }

        /**
         * @param loadBalancerId ID of the SLB with listeners.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(String loadBalancerId) {
            $.loadBalancerId = loadBalancerId;
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
         * @param protocol Filter listeners by the specified protocol. Valid values: `http`, `https`, `tcp` and `udp`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable String protocol) {
            $.protocol = protocol;
            return this;
        }

        public GetListenersPlainArgs build() {
            if ($.loadBalancerId == null) {
                throw new MissingRequiredPropertyException("GetListenersPlainArgs", "loadBalancerId");
            }
            return $;
        }
    }

}
