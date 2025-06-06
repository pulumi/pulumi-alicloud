// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Outputs
{

    [OutputType]
    public sealed class GetListenersListenerXforwardedForConfigResult
    {
        /// <summary>
        /// The Custom Header Field Names Only When `xforwardedforclientcert_issuerdnenabled`, Which Evaluates to True When the Entry into Force of.
        /// </summary>
        public readonly string XforwardedforclientcertIssuerdnalias;
        /// <summary>
        /// Indicates Whether the `X-Forwarded-Clientcert-issuerdn` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate after the Manifests Are Signed, the Publisher Information.
        /// </summary>
        public readonly bool XforwardedforclientcertIssuerdnenabled;
        /// <summary>
        /// The Custom Header Field Names Only When `xforwardedforclientcertclientverifyenabled` Has a Value of True, this Value Will Not Take Effect until.The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
        /// </summary>
        public readonly string Xforwardedforclientcertclientverifyalias;
        /// <summary>
        /// Indicates Whether the `X-Forwarded-Clientcert-clientverify` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate to Verify the Results.
        /// </summary>
        public readonly bool Xforwardedforclientcertclientverifyenabled;
        /// <summary>
        /// The Custom Header Field Names Only When `xforwardedforclientcertfingerprintenabled`, Which Evaluates to True When the Entry into Force of.The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
        /// </summary>
        public readonly string Xforwardedforclientcertfingerprintalias;
        /// <summary>
        /// Indicates Whether the `X-Forwarded-Clientcert-fingerprint` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate Fingerprint Value.
        /// </summary>
        public readonly bool Xforwardedforclientcertfingerprintenabled;
        /// <summary>
        /// The name of the custom header. This parameter is valid only if `xforwardedforclientcertsubjectdnenabled` is set to true. The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
        /// </summary>
        public readonly string Xforwardedforclientcertsubjectdnalias;
        /// <summary>
        /// Specifies whether to use the `X-Forwarded-Clientcert-subjectdn` header field to obtain information about the owner of the ALB client certificate. Valid values: true and false. Default value: false.
        /// </summary>
        public readonly bool Xforwardedforclientcertsubjectdnenabled;
        /// <summary>
        /// Indicates Whether the X-Forwarded-Client-Port Header Field Is Used to Obtain Access to Server Load Balancer Instances to the Client, and Those of the Ports.
        /// </summary>
        public readonly bool Xforwardedforclientsrcportenabled;
        /// <summary>
        /// Indicates whether the X-Forwarded-For header field is used to obtain the real IP address of tqhe client. Valid values: true and false. Default value: true.
        /// </summary>
        public readonly bool Xforwardedforenabled;
        /// <summary>
        /// Indicates Whether the X-Forwarded-Proto Header Field Is Used to Obtain the Server Load Balancer Instance Snooping Protocols.
        /// </summary>
        public readonly bool Xforwardedforprotoenabled;
        /// <summary>
        /// Indicates whether the SLB-ID header field is used to obtain the ID of the ALB instance. Valid values: true and false. Default value: false.
        /// </summary>
        public readonly bool Xforwardedforslbidenabled;
        /// <summary>
        /// Indicates Whether the X-Forwarded-Port Header Field Is Used to Obtain the Server Load Balancer Instance Listening Port.
        /// </summary>
        public readonly bool Xforwardedforslbportenabled;

        [OutputConstructor]
        private GetListenersListenerXforwardedForConfigResult(
            string xforwardedforclientcertIssuerdnalias,

            bool xforwardedforclientcertIssuerdnenabled,

            string xforwardedforclientcertclientverifyalias,

            bool xforwardedforclientcertclientverifyenabled,

            string xforwardedforclientcertfingerprintalias,

            bool xforwardedforclientcertfingerprintenabled,

            string xforwardedforclientcertsubjectdnalias,

            bool xforwardedforclientcertsubjectdnenabled,

            bool xforwardedforclientsrcportenabled,

            bool xforwardedforenabled,

            bool xforwardedforprotoenabled,

            bool xforwardedforslbidenabled,

            bool xforwardedforslbportenabled)
        {
            XforwardedforclientcertIssuerdnalias = xforwardedforclientcertIssuerdnalias;
            XforwardedforclientcertIssuerdnenabled = xforwardedforclientcertIssuerdnenabled;
            Xforwardedforclientcertclientverifyalias = xforwardedforclientcertclientverifyalias;
            Xforwardedforclientcertclientverifyenabled = xforwardedforclientcertclientverifyenabled;
            Xforwardedforclientcertfingerprintalias = xforwardedforclientcertfingerprintalias;
            Xforwardedforclientcertfingerprintenabled = xforwardedforclientcertfingerprintenabled;
            Xforwardedforclientcertsubjectdnalias = xforwardedforclientcertsubjectdnalias;
            Xforwardedforclientcertsubjectdnenabled = xforwardedforclientcertsubjectdnenabled;
            Xforwardedforclientsrcportenabled = xforwardedforclientsrcportenabled;
            Xforwardedforenabled = xforwardedforenabled;
            Xforwardedforprotoenabled = xforwardedforprotoenabled;
            Xforwardedforslbidenabled = xforwardedforslbidenabled;
            Xforwardedforslbportenabled = xforwardedforslbportenabled;
        }
    }
}
