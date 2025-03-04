// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcFirewallControlPoliciesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcFirewallControlPoliciesPlainArgs Empty = new GetVpcFirewallControlPoliciesPlainArgs();

    /**
     * The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
     * 
     */
    @Import(name="aclAction")
    private @Nullable String aclAction;

    /**
     * @return The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
     * 
     */
    public Optional<String> aclAction() {
        return Optional.ofNullable(this.aclAction);
    }

    /**
     * Access control over VPC firewalls strategy unique identifier.
     * 
     */
    @Import(name="aclUuid")
    private @Nullable String aclUuid;

    /**
     * @return Access control over VPC firewalls strategy unique identifier.
     * 
     */
    public Optional<String> aclUuid() {
        return Optional.ofNullable(this.aclUuid);
    }

    /**
     * Access control over VPC firewalls description of the strategy information.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Access control over VPC firewalls description of the strategy information.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Access control over VPC firewalls strategy the destination address in.
     * 
     */
    @Import(name="destination")
    private @Nullable String destination;

    /**
     * @return Access control over VPC firewalls strategy the destination address in.
     * 
     */
    public Optional<String> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * A list of Vpc Firewall Control Policy IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Vpc Firewall Control Policy IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The language of the content within the request and response. Valid values: `zh`, `en`.
     * 
     */
    @Import(name="lang")
    private @Nullable String lang;

    /**
     * @return The language of the content within the request and response. Valid values: `zh`, `en`.
     * 
     */
    public Optional<String> lang() {
        return Optional.ofNullable(this.lang);
    }

    /**
     * The UID of the member account of the current Alibaba cloud account.
     * 
     */
    @Import(name="memberUid")
    private @Nullable String memberUid;

    /**
     * @return The UID of the member account of the current Alibaba cloud account.
     * 
     */
    public Optional<String> memberUid() {
        return Optional.ofNullable(this.memberUid);
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

    @Import(name="pageNumber")
    private @Nullable Integer pageNumber;

    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    @Import(name="pageSize")
    private @Nullable Integer pageSize;

    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    /**
     * Access control over VPC firewalls strategy access traffic of the protocol type.
     * 
     */
    @Import(name="proto")
    private @Nullable String proto;

    /**
     * @return Access control over VPC firewalls strategy access traffic of the protocol type.
     * 
     */
    public Optional<String> proto() {
        return Optional.ofNullable(this.proto);
    }

    /**
     * The enabled status of the access control policy. The policy is enabled by default after it is created. Value:
     * - **true**: Enable access control policies
     * - **false**: does not enable access control policies.
     * 
     */
    @Import(name="release")
    private @Nullable Boolean release;

    /**
     * @return The enabled status of the access control policy. The policy is enabled by default after it is created. Value:
     * - **true**: Enable access control policies
     * - **false**: does not enable access control policies.
     * 
     */
    public Optional<Boolean> release() {
        return Optional.ofNullable(this.release);
    }

    /**
     * Access control over VPC firewalls strategy in the source address.
     * 
     */
    @Import(name="source")
    private @Nullable String source;

    /**
     * @return Access control over VPC firewalls strategy in the source address.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * The ID of the VPC firewall instance. Value:
     * - When the VPC firewall protects traffic between two VPCs connected through the cloud enterprise network, the policy group ID uses the cloud enterprise network instance ID.
     * - When the VPC firewall protects traffic between two VPCs connected through the express connection, the policy group ID uses the ID of the VPC firewall instance.
     * 
     */
    @Import(name="vpcFirewallId", required=true)
    private String vpcFirewallId;

    /**
     * @return The ID of the VPC firewall instance. Value:
     * - When the VPC firewall protects traffic between two VPCs connected through the cloud enterprise network, the policy group ID uses the cloud enterprise network instance ID.
     * - When the VPC firewall protects traffic between two VPCs connected through the express connection, the policy group ID uses the ID of the VPC firewall instance.
     * 
     */
    public String vpcFirewallId() {
        return this.vpcFirewallId;
    }

    private GetVpcFirewallControlPoliciesPlainArgs() {}

    private GetVpcFirewallControlPoliciesPlainArgs(GetVpcFirewallControlPoliciesPlainArgs $) {
        this.aclAction = $.aclAction;
        this.aclUuid = $.aclUuid;
        this.description = $.description;
        this.destination = $.destination;
        this.ids = $.ids;
        this.lang = $.lang;
        this.memberUid = $.memberUid;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
        this.proto = $.proto;
        this.release = $.release;
        this.source = $.source;
        this.vpcFirewallId = $.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcFirewallControlPoliciesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcFirewallControlPoliciesPlainArgs $;

        public Builder() {
            $ = new GetVpcFirewallControlPoliciesPlainArgs();
        }

        public Builder(GetVpcFirewallControlPoliciesPlainArgs defaults) {
            $ = new GetVpcFirewallControlPoliciesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aclAction The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
         * 
         * @return builder
         * 
         */
        public Builder aclAction(@Nullable String aclAction) {
            $.aclAction = aclAction;
            return this;
        }

        /**
         * @param aclUuid Access control over VPC firewalls strategy unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder aclUuid(@Nullable String aclUuid) {
            $.aclUuid = aclUuid;
            return this;
        }

        /**
         * @param description Access control over VPC firewalls description of the strategy information.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param destination Access control over VPC firewalls strategy the destination address in.
         * 
         * @return builder
         * 
         */
        public Builder destination(@Nullable String destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param ids A list of Vpc Firewall Control Policy IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Vpc Firewall Control Policy IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param lang The language of the content within the request and response. Valid values: `zh`, `en`.
         * 
         * @return builder
         * 
         */
        public Builder lang(@Nullable String lang) {
            $.lang = lang;
            return this;
        }

        /**
         * @param memberUid The UID of the member account of the current Alibaba cloud account.
         * 
         * @return builder
         * 
         */
        public Builder memberUid(@Nullable String memberUid) {
            $.memberUid = memberUid;
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

        public Builder pageNumber(@Nullable Integer pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        public Builder pageSize(@Nullable Integer pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        /**
         * @param proto Access control over VPC firewalls strategy access traffic of the protocol type.
         * 
         * @return builder
         * 
         */
        public Builder proto(@Nullable String proto) {
            $.proto = proto;
            return this;
        }

        /**
         * @param release The enabled status of the access control policy. The policy is enabled by default after it is created. Value:
         * - **true**: Enable access control policies
         * - **false**: does not enable access control policies.
         * 
         * @return builder
         * 
         */
        public Builder release(@Nullable Boolean release) {
            $.release = release;
            return this;
        }

        /**
         * @param source Access control over VPC firewalls strategy in the source address.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable String source) {
            $.source = source;
            return this;
        }

        /**
         * @param vpcFirewallId The ID of the VPC firewall instance. Value:
         * - When the VPC firewall protects traffic between two VPCs connected through the cloud enterprise network, the policy group ID uses the cloud enterprise network instance ID.
         * - When the VPC firewall protects traffic between two VPCs connected through the express connection, the policy group ID uses the ID of the VPC firewall instance.
         * 
         * @return builder
         * 
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            $.vpcFirewallId = vpcFirewallId;
            return this;
        }

        public GetVpcFirewallControlPoliciesPlainArgs build() {
            if ($.vpcFirewallId == null) {
                throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPlainArgs", "vpcFirewallId");
            }
            return $;
        }
    }

}
