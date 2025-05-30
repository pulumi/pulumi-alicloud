// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayVpnAttachmentIkeConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayVpnAttachmentIkeConfigArgs Empty = new GatewayVpnAttachmentIkeConfigArgs();

    /**
     * The authentication algorithm negotiated in the first stage. Valid values: md5, sha1, sha256, sha384, sha512. Default value: md5.
     * 
     */
    @Import(name="ikeAuthAlg")
    private @Nullable Output<String> ikeAuthAlg;

    /**
     * @return The authentication algorithm negotiated in the first stage. Valid values: md5, sha1, sha256, sha384, sha512. Default value: md5.
     * 
     */
    public Optional<Output<String>> ikeAuthAlg() {
        return Optional.ofNullable(this.ikeAuthAlg);
    }

    /**
     * The encryption algorithm that is used in Phase 1 negotiations. Valid values: aes, aes192, aes256, des, and 3des. Default value: aes.
     * 
     */
    @Import(name="ikeEncAlg")
    private @Nullable Output<String> ikeEncAlg;

    /**
     * @return The encryption algorithm that is used in Phase 1 negotiations. Valid values: aes, aes192, aes256, des, and 3des. Default value: aes.
     * 
     */
    public Optional<Output<String>> ikeEncAlg() {
        return Optional.ofNullable(this.ikeEncAlg);
    }

    /**
     * The SA lifetime as a result of Phase 1 negotiations. Unit: seconds. Valid values: 0 to 86400. Default value: 86400.
     * 
     */
    @Import(name="ikeLifetime")
    private @Nullable Output<Integer> ikeLifetime;

    /**
     * @return The SA lifetime as a result of Phase 1 negotiations. Unit: seconds. Valid values: 0 to 86400. Default value: 86400.
     * 
     */
    public Optional<Output<Integer>> ikeLifetime() {
        return Optional.ofNullable(this.ikeLifetime);
    }

    /**
     * IKE mode, the negotiation mode. Valid values: main and aggressive. Default value: main.
     * 
     */
    @Import(name="ikeMode")
    private @Nullable Output<String> ikeMode;

    /**
     * @return IKE mode, the negotiation mode. Valid values: main and aggressive. Default value: main.
     * 
     */
    public Optional<Output<String>> ikeMode() {
        return Optional.ofNullable(this.ikeMode);
    }

    /**
     * The Diffie-Hellman key exchange algorithm used in the first stage negotiation. Valid values: group1, group2, group5, or group14. Default value: group2.
     * 
     */
    @Import(name="ikePfs")
    private @Nullable Output<String> ikePfs;

    /**
     * @return The Diffie-Hellman key exchange algorithm used in the first stage negotiation. Valid values: group1, group2, group5, or group14. Default value: group2.
     * 
     */
    public Optional<Output<String>> ikePfs() {
        return Optional.ofNullable(this.ikePfs);
    }

    /**
     * The version of the IKE protocol. Value: ikev1 or ikev2. Default value: ikev1.
     * 
     */
    @Import(name="ikeVersion")
    private @Nullable Output<String> ikeVersion;

    /**
     * @return The version of the IKE protocol. Value: ikev1 or ikev2. Default value: ikev1.
     * 
     */
    public Optional<Output<String>> ikeVersion() {
        return Optional.ofNullable(this.ikeVersion);
    }

    /**
     * The identifier on the Alibaba Cloud side of the IPsec connection. The length is limited to 100 characters. The default value is leftId-not-exist
     * 
     */
    @Import(name="localId")
    private @Nullable Output<String> localId;

    /**
     * @return The identifier on the Alibaba Cloud side of the IPsec connection. The length is limited to 100 characters. The default value is leftId-not-exist
     * 
     */
    public Optional<Output<String>> localId() {
        return Optional.ofNullable(this.localId);
    }

    /**
     * A pre-shared key for authentication between the VPN gateway and the local data center. The key length is 1~100 characters.
     * - If you do not specify a pre-shared key, the system randomly generates a 16-bit string as the pre-shared key.
     * - The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the on-premises data center. Otherwise, connections between the on-premises data center and the VPN gateway cannot be established.
     * 
     */
    @Import(name="psk")
    private @Nullable Output<String> psk;

    /**
     * @return A pre-shared key for authentication between the VPN gateway and the local data center. The key length is 1~100 characters.
     * - If you do not specify a pre-shared key, the system randomly generates a 16-bit string as the pre-shared key.
     * - The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the on-premises data center. Otherwise, connections between the on-premises data center and the VPN gateway cannot be established.
     * 
     */
    public Optional<Output<String>> psk() {
        return Optional.ofNullable(this.psk);
    }

    /**
     * The identifier of the IPsec connection to the local data center. The length is limited to 100 characters. The default value is the IP address of the user gateway.
     * 
     */
    @Import(name="remoteId")
    private @Nullable Output<String> remoteId;

    /**
     * @return The identifier of the IPsec connection to the local data center. The length is limited to 100 characters. The default value is the IP address of the user gateway.
     * 
     */
    public Optional<Output<String>> remoteId() {
        return Optional.ofNullable(this.remoteId);
    }

    private GatewayVpnAttachmentIkeConfigArgs() {}

    private GatewayVpnAttachmentIkeConfigArgs(GatewayVpnAttachmentIkeConfigArgs $) {
        this.ikeAuthAlg = $.ikeAuthAlg;
        this.ikeEncAlg = $.ikeEncAlg;
        this.ikeLifetime = $.ikeLifetime;
        this.ikeMode = $.ikeMode;
        this.ikePfs = $.ikePfs;
        this.ikeVersion = $.ikeVersion;
        this.localId = $.localId;
        this.psk = $.psk;
        this.remoteId = $.remoteId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayVpnAttachmentIkeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayVpnAttachmentIkeConfigArgs $;

        public Builder() {
            $ = new GatewayVpnAttachmentIkeConfigArgs();
        }

        public Builder(GatewayVpnAttachmentIkeConfigArgs defaults) {
            $ = new GatewayVpnAttachmentIkeConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ikeAuthAlg The authentication algorithm negotiated in the first stage. Valid values: md5, sha1, sha256, sha384, sha512. Default value: md5.
         * 
         * @return builder
         * 
         */
        public Builder ikeAuthAlg(@Nullable Output<String> ikeAuthAlg) {
            $.ikeAuthAlg = ikeAuthAlg;
            return this;
        }

        /**
         * @param ikeAuthAlg The authentication algorithm negotiated in the first stage. Valid values: md5, sha1, sha256, sha384, sha512. Default value: md5.
         * 
         * @return builder
         * 
         */
        public Builder ikeAuthAlg(String ikeAuthAlg) {
            return ikeAuthAlg(Output.of(ikeAuthAlg));
        }

        /**
         * @param ikeEncAlg The encryption algorithm that is used in Phase 1 negotiations. Valid values: aes, aes192, aes256, des, and 3des. Default value: aes.
         * 
         * @return builder
         * 
         */
        public Builder ikeEncAlg(@Nullable Output<String> ikeEncAlg) {
            $.ikeEncAlg = ikeEncAlg;
            return this;
        }

        /**
         * @param ikeEncAlg The encryption algorithm that is used in Phase 1 negotiations. Valid values: aes, aes192, aes256, des, and 3des. Default value: aes.
         * 
         * @return builder
         * 
         */
        public Builder ikeEncAlg(String ikeEncAlg) {
            return ikeEncAlg(Output.of(ikeEncAlg));
        }

        /**
         * @param ikeLifetime The SA lifetime as a result of Phase 1 negotiations. Unit: seconds. Valid values: 0 to 86400. Default value: 86400.
         * 
         * @return builder
         * 
         */
        public Builder ikeLifetime(@Nullable Output<Integer> ikeLifetime) {
            $.ikeLifetime = ikeLifetime;
            return this;
        }

        /**
         * @param ikeLifetime The SA lifetime as a result of Phase 1 negotiations. Unit: seconds. Valid values: 0 to 86400. Default value: 86400.
         * 
         * @return builder
         * 
         */
        public Builder ikeLifetime(Integer ikeLifetime) {
            return ikeLifetime(Output.of(ikeLifetime));
        }

        /**
         * @param ikeMode IKE mode, the negotiation mode. Valid values: main and aggressive. Default value: main.
         * 
         * @return builder
         * 
         */
        public Builder ikeMode(@Nullable Output<String> ikeMode) {
            $.ikeMode = ikeMode;
            return this;
        }

        /**
         * @param ikeMode IKE mode, the negotiation mode. Valid values: main and aggressive. Default value: main.
         * 
         * @return builder
         * 
         */
        public Builder ikeMode(String ikeMode) {
            return ikeMode(Output.of(ikeMode));
        }

        /**
         * @param ikePfs The Diffie-Hellman key exchange algorithm used in the first stage negotiation. Valid values: group1, group2, group5, or group14. Default value: group2.
         * 
         * @return builder
         * 
         */
        public Builder ikePfs(@Nullable Output<String> ikePfs) {
            $.ikePfs = ikePfs;
            return this;
        }

        /**
         * @param ikePfs The Diffie-Hellman key exchange algorithm used in the first stage negotiation. Valid values: group1, group2, group5, or group14. Default value: group2.
         * 
         * @return builder
         * 
         */
        public Builder ikePfs(String ikePfs) {
            return ikePfs(Output.of(ikePfs));
        }

        /**
         * @param ikeVersion The version of the IKE protocol. Value: ikev1 or ikev2. Default value: ikev1.
         * 
         * @return builder
         * 
         */
        public Builder ikeVersion(@Nullable Output<String> ikeVersion) {
            $.ikeVersion = ikeVersion;
            return this;
        }

        /**
         * @param ikeVersion The version of the IKE protocol. Value: ikev1 or ikev2. Default value: ikev1.
         * 
         * @return builder
         * 
         */
        public Builder ikeVersion(String ikeVersion) {
            return ikeVersion(Output.of(ikeVersion));
        }

        /**
         * @param localId The identifier on the Alibaba Cloud side of the IPsec connection. The length is limited to 100 characters. The default value is leftId-not-exist
         * 
         * @return builder
         * 
         */
        public Builder localId(@Nullable Output<String> localId) {
            $.localId = localId;
            return this;
        }

        /**
         * @param localId The identifier on the Alibaba Cloud side of the IPsec connection. The length is limited to 100 characters. The default value is leftId-not-exist
         * 
         * @return builder
         * 
         */
        public Builder localId(String localId) {
            return localId(Output.of(localId));
        }

        /**
         * @param psk A pre-shared key for authentication between the VPN gateway and the local data center. The key length is 1~100 characters.
         * - If you do not specify a pre-shared key, the system randomly generates a 16-bit string as the pre-shared key.
         * - The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the on-premises data center. Otherwise, connections between the on-premises data center and the VPN gateway cannot be established.
         * 
         * @return builder
         * 
         */
        public Builder psk(@Nullable Output<String> psk) {
            $.psk = psk;
            return this;
        }

        /**
         * @param psk A pre-shared key for authentication between the VPN gateway and the local data center. The key length is 1~100 characters.
         * - If you do not specify a pre-shared key, the system randomly generates a 16-bit string as the pre-shared key.
         * - The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the on-premises data center. Otherwise, connections between the on-premises data center and the VPN gateway cannot be established.
         * 
         * @return builder
         * 
         */
        public Builder psk(String psk) {
            return psk(Output.of(psk));
        }

        /**
         * @param remoteId The identifier of the IPsec connection to the local data center. The length is limited to 100 characters. The default value is the IP address of the user gateway.
         * 
         * @return builder
         * 
         */
        public Builder remoteId(@Nullable Output<String> remoteId) {
            $.remoteId = remoteId;
            return this;
        }

        /**
         * @param remoteId The identifier of the IPsec connection to the local data center. The length is limited to 100 characters. The default value is the IP address of the user gateway.
         * 
         * @return builder
         * 
         */
        public Builder remoteId(String remoteId) {
            return remoteId(Output.of(remoteId));
        }

        public GatewayVpnAttachmentIkeConfigArgs build() {
            return $;
        }
    }

}
