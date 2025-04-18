// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDelegatedAdministratorsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDelegatedAdministratorsArgs Empty = new GetDelegatedAdministratorsArgs();

    /**
     * A list of Delegated Administrator IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Delegated Administrator IDs.
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

    @Import(name="pageNumber")
    private @Nullable Output<Integer> pageNumber;

    public Optional<Output<Integer>> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    @Import(name="pageSize")
    private @Nullable Output<Integer> pageSize;

    public Optional<Output<Integer>> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    /**
     * The identification of the trusted service.
     * 
     */
    @Import(name="servicePrincipal")
    private @Nullable Output<String> servicePrincipal;

    /**
     * @return The identification of the trusted service.
     * 
     */
    public Optional<Output<String>> servicePrincipal() {
        return Optional.ofNullable(this.servicePrincipal);
    }

    private GetDelegatedAdministratorsArgs() {}

    private GetDelegatedAdministratorsArgs(GetDelegatedAdministratorsArgs $) {
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
        this.servicePrincipal = $.servicePrincipal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDelegatedAdministratorsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDelegatedAdministratorsArgs $;

        public Builder() {
            $ = new GetDelegatedAdministratorsArgs();
        }

        public Builder(GetDelegatedAdministratorsArgs defaults) {
            $ = new GetDelegatedAdministratorsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Delegated Administrator IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Delegated Administrator IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Delegated Administrator IDs.
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

        public Builder pageNumber(@Nullable Output<Integer> pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        public Builder pageNumber(Integer pageNumber) {
            return pageNumber(Output.of(pageNumber));
        }

        public Builder pageSize(@Nullable Output<Integer> pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        public Builder pageSize(Integer pageSize) {
            return pageSize(Output.of(pageSize));
        }

        /**
         * @param servicePrincipal The identification of the trusted service.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipal(@Nullable Output<String> servicePrincipal) {
            $.servicePrincipal = servicePrincipal;
            return this;
        }

        /**
         * @param servicePrincipal The identification of the trusted service.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipal(String servicePrincipal) {
            return servicePrincipal(Output.of(servicePrincipal));
        }

        public GetDelegatedAdministratorsArgs build() {
            return $;
        }
    }

}
