// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTransitRouterMulticastDomainSourcesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransitRouterMulticastDomainSourcesArgs Empty = new GetTransitRouterMulticastDomainSourcesArgs();

    /**
     * A list of the multicast domain IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of the multicast domain IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The ID of the multicast domain to which the multicast source belongs.
     * 
     */
    @Import(name="transitRouterMulticastDomainId", required=true)
    private Output<String> transitRouterMulticastDomainId;

    /**
     * @return The ID of the multicast domain to which the multicast source belongs.
     * 
     */
    public Output<String> transitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

    private GetTransitRouterMulticastDomainSourcesArgs() {}

    private GetTransitRouterMulticastDomainSourcesArgs(GetTransitRouterMulticastDomainSourcesArgs $) {
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.transitRouterMulticastDomainId = $.transitRouterMulticastDomainId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransitRouterMulticastDomainSourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransitRouterMulticastDomainSourcesArgs $;

        public Builder() {
            $ = new GetTransitRouterMulticastDomainSourcesArgs();
        }

        public Builder(GetTransitRouterMulticastDomainSourcesArgs defaults) {
            $ = new GetTransitRouterMulticastDomainSourcesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of the multicast domain IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of the multicast domain IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of the multicast domain IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param transitRouterMulticastDomainId The ID of the multicast domain to which the multicast source belongs.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterMulticastDomainId(Output<String> transitRouterMulticastDomainId) {
            $.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }

        /**
         * @param transitRouterMulticastDomainId The ID of the multicast domain to which the multicast source belongs.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            return transitRouterMulticastDomainId(Output.of(transitRouterMulticastDomainId));
        }

        public GetTransitRouterMulticastDomainSourcesArgs build() {
            if ($.transitRouterMulticastDomainId == null) {
                throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainSourcesArgs", "transitRouterMulticastDomainId");
            }
            return $;
        }
    }

}