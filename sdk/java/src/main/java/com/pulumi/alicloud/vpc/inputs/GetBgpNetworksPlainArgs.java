// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBgpNetworksPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBgpNetworksPlainArgs Empty = new GetBgpNetworksPlainArgs();

    /**
     * A list of Bgp Network IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Bgp Network IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
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
     * The ID of the router to which the route table belongs.
     * 
     */
    @Import(name="routerId")
    private @Nullable String routerId;

    /**
     * @return The ID of the router to which the route table belongs.
     * 
     */
    public Optional<String> routerId() {
        return Optional.ofNullable(this.routerId);
    }

    /**
     * The state of the advertised BGP network. Valid values: `Available`, `Pending`, `Deleting`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The state of the advertised BGP network. Valid values: `Available`, `Pending`, `Deleting`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetBgpNetworksPlainArgs() {}

    private GetBgpNetworksPlainArgs(GetBgpNetworksPlainArgs $) {
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.routerId = $.routerId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBgpNetworksPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBgpNetworksPlainArgs $;

        public Builder() {
            $ = new GetBgpNetworksPlainArgs();
        }

        public Builder(GetBgpNetworksPlainArgs defaults) {
            $ = new GetBgpNetworksPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Bgp Network IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Bgp Network IDs.
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
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param routerId The ID of the router to which the route table belongs.
         * 
         * @return builder
         * 
         */
        public Builder routerId(@Nullable String routerId) {
            $.routerId = routerId;
            return this;
        }

        /**
         * @param status The state of the advertised BGP network. Valid values: `Available`, `Pending`, `Deleting`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetBgpNetworksPlainArgs build() {
            return $;
        }
    }

}
