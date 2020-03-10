package com.manuflowers.paymentsculqi

import com.manuflowers.paymentsculqi.network.authorization.AuthInteractorImpl
import com.manuflowers.paymentsculqi.network.authorization.AuthCallback
import com.manuflowers.paymentsculqi.network.entities.request.GetInstallmentsEntity
import com.manuflowers.paymentsculqi.network.entities.request.GetTokenEntity
import com.manuflowers.paymentsculqi.network.installments.InstallmentsCallback
import com.manuflowers.paymentsculqi.network.installments.InstallmentsInteractorImpl

class CulqiSdk {

    fun generateToken(
        privateKey: String,
        getTokenEntity: GetTokenEntity,
        onAuthCallback: AuthCallback
    ) {
        return AuthInteractorImpl().getToken(
            privateKey = privateKey,
            getTokenEntity = getTokenEntity,
            onAuthCallback = onAuthCallback
        )
    }

    fun getInstallments(
        privateKey: String,
        getInstallmentsEntity: GetInstallmentsEntity,
        installmentsCallback: InstallmentsCallback
    ) {
        return InstallmentsInteractorImpl().getInstallments(
            privateKey = privateKey,
            getInstallmentsEntity = getInstallmentsEntity,
            installmentsCallback = installmentsCallback
        )
    }
}